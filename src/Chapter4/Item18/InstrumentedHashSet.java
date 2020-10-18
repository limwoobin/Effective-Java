package Chapter4.Item18;

import java.util.Collection;
import java.util.HashSet;

// 잘못된 예 - 상속을 잘못했음
// (HashSet의 addAll 메소드가 다시 InstrumentedHashSet에서 구현한 add 를 호출하게 된다. )
public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;

    public InstrumentedHashSet() {

    }

    public InstrumentedHashSet(int initCap , float loadFactor) {
        super(initCap , loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
