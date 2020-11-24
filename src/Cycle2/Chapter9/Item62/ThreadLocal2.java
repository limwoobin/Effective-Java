package Cycle2.Chapter9.Item62;

public class ThreadLocal2<T> {
    private ThreadLocal2() {}

    public static class Key { // (권한)
        Key() {}
    }

    // 위조 불가능한 고유 키를 생성.
    public static Key getKey() {
        return new Key();
    }

    public void set(T value) {}

    public T get() {
        return null;
    }
}
