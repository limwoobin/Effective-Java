package Cycle2.Chapter4.Item18;

import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        InstrumentedHashSet<String> set = new InstrumentedHashSet<>();
        set.addAll(Arrays.asList("x" , "xx" , "xxx"));
        System.out.println(set.getAddCount());

        InstrumentedHashSet2<String> set2 = new InstrumentedHashSet2<>(new HashSet<>());
        set2.addAll(Arrays.asList("z" , "zz" , "zzz"));
        System.out.println(set2.getAddCount());
    }
}
