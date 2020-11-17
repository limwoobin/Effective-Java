package Cycle1.Chapter3.Item13;


public class HashTable implements Cloneable {
    private Entry[] buckets = {};

    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        Entry(Object key , Object value , Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        Entry deepCopy() {
            return new Entry(key , value , next == null ? null : next.deepCopy());
        }

        // 재귀호출이 아닌 반복자를 사용한 방법
        Entry deepCopy2() {
            Entry result = new Entry(key , value , next);
            for (Entry p = result; p.next != null; p = p.next) {
                p.next = new Entry(p.next.key , p.next.value , p.next.next);
            }

            return result;
        }
    }

    @Override
    public HashTable clone() {
        try {
            HashTable result = (HashTable) super.clone();
            result.buckets = new Entry[buckets.length];
            for (int i=0; i<buckets.length; i++) {
                if (buckets[i] != null) {
                    result.buckets[i] = buckets[i].deepCopy();
                }
            }

            return result;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
