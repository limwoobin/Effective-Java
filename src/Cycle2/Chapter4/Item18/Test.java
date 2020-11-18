package Cycle2.Chapter4.Item18;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        InstrumentedHashSet<String> set = new InstrumentedHashSet<>();
        set.addAll(Arrays.asList("x" , "xx" , "xxx"));
        System.out.println(set.getAddCount());
    }
}
