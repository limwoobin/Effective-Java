package Generic.WildCardSubTyping;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        addAll(list); -> compile error

        List<Integer> list1 = new ArrayList<>();
        List<Float> list2 = new ArrayList<>();
        addAll2(list1);     // ok
        addAll2(list2);     // ok
    }

    private static void addAll(List<Number> list) {

    }

    private static void addAll2(List<? extends Number> list) {

    }
}
