package Cycle2.Chapter11.Item79;


import Cycle2.Chapter4.Item18.ForwardingSet;

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
        synchronized (observers) {
            for(SetObserver<E> observer : observers) {
                observer.added(this, element);
            }
        }
    }

    // 외계인 메서드를 동기화 블록 밖으로 옮겼다.
    public void notifyElementAdded2(E element) {
        List<SetObserver<E>> snapShot = null;
        synchronized (observers) {
            snapShot = new ArrayList<>(observers);
        }

        for (SetObserver<E> observer : snapShot) {
            observer.added(this , element); //외계인 메서드를 동기화 블록 바깥으로 옮겼다.
        }
    }

    @Override
    public boolean add(E element) {
        boolean added = super.add(element);
        if (added) {
            notifyElementAdded2(element);
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
