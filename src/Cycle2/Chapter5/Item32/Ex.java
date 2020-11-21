package Cycle2.Chapter5.Item32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Ex {
    // 제네릭과 varargs를 혼용하면 타입 안정성이 깨진다
    static void dangerous(List<String>... stringLists) {
        List<Integer> intList = Arrays.asList(42);
        Object[] objects = stringLists;
        objects[0] = intList;   // 힙 오염 발생
        String s = stringLists[0].get(0);   // ClassCastException
    }

    // 자신의 제네릭 매개변수 배열의 참조를 노출한다 - 안전하지 않다
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

    // 제네릭 varargs 매개변수를 안전하게 사용하는 메서드
    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] attributes = pickTwo("very" , "past" , "cheap");
    }
}
