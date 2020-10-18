package Chapter5.Item32;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

    static <T> T[] toArray(T... args) {
        return args;
    }

    static <T> T[] pickTwo(T a , T b , T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0 : return toArray(a , b);
            case 1 : return toArray(a , c);
            case 2 : return toArray(b , c);
        }

        throw new AssertionError();
    }


//    제네릭 varargs 매개변수를 안전하게 사용하는 메서드
    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }

        return result;
    }

    static <T> List<T> flatten2(List<List<? extends T>> lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }

        return result;
    }

    public static void main(String[] args) {
        Integer arr[] = toArray(1,3,5);
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

//        -> 아래 메소드는 pickTwo 에서 Object[] 로 받은 후 Integer or String 으로 형변환하는 과정에서
//        Object가 Integer or String 의 하위 타입이 아니므로 ClassCastException 이 발생한다.
//        Integer[] attributes = pickTwo(1 , 2, 3);
//        String[] attributes = pickTwo("A" , "B" , "C");


    }
}
