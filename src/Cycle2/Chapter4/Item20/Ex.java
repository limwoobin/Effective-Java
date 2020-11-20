package Cycle2.Chapter4.Item20;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class Ex {
    static List<Integer> intArrayAsList(int[] a) {
        Objects.requireNonNull(a);

        return new AbstractList<Integer>() {

            @Override
            public Integer get(int index) {
                return a[index]; // 오토박싱
            }

            @Override
            public Integer set(int index, Integer element) {
                int oldVal = a[index];
                a[index] = element; // 오토언박싱
                return oldVal;      // 오토박싱
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }
}
