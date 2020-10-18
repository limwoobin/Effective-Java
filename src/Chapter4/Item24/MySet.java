package Chapter4.Item24;


import java.util.AbstractSet;
import java.util.Iterator;

// 비정적 멤버 클래스의 흔한 쓰임 - 자신의 반복자 구현
public class MySet<E> extends AbstractSet<E> {

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    @Override
    public int size() {
        return 0;
    }

    private class MyIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
