package Cycle1.Chapter11.item79;

import Cycle1.Chapter4.Item18.ForwardingSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

// 외계인 메서드 -> 동기화된 영역 안에서는 재정의할 수 있는 메서드는 호출해서는 안됨.
public class ObservableSet<E> extends ForwardingSet<E> {
    public ObservableSet(Set<E> set) {
        super(set);
    }

    private final List<SetObserver<E>> observers = new ArrayList<>();

    public void addObserver(SetObserver<E> observer) {
        synchronized (observers) {
            observers.add(observer);
        }
    }

    public boolean removeObserver(SetObserver<E> observer) {
        synchronized (observers) {
            return observers.remove(observer);
        }
    }

    public void notifyElementAdded(E element) {
        List<SetObserver<E>> snapShot = null;
        synchronized (observers) {
            snapShot = new ArrayList<>(observers);
//            for (SetObserver<E> observer : observers) {
//                // added -> 외계인 메서드
//                observer.added(this , element);
//            }
        }

        // added(외계인 메서드)를 동기화블록 바깥으로 이동
        for (SetObserver<E> observer : snapShot) {
            observer.added(this , element);
        }
    }

    @Override
    public boolean add(E element) {
        boolean added = super.add(element);
        if (added) {
            notifyElementAdded(element);
        }

        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element : c) {
            result |= add(element);
        }

        return result;
    }
}
