package Generic.BoundedWildCardType;

import java.util.List;

public class Ex {
    public void doSomething(List<? extends MyClass> list) {
        for (MyClass e : list) {    // ok
            System.out.println(e);
        }
    }

    public void doSomething2(List<? extends MyClass> list) {
//        list.add(new MyClass()); // complie error
    }

    public void doSomething3(List<? super MyClass> list) {
        // compile error
//        for (MyClass e : list) {
//
//        }
    }

    public void doSomething4(List<? super MyClass> list) {
        list.add(new MyClass()); // ok
    }
}

// Producer-extends 는 읽기만 가능 ex) System.out.println
// Comsumer-super 는 쓰기만 가능 ex) add