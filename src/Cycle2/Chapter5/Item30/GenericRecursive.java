package Cycle2.Chapter5.Item30;

import java.util.Collection;
import java.util.Objects;

public class GenericRecursive {

    // 컬렉션에서 최댓값을 반환 - 재귀적 타입 한정 사용
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty()) throw new IllegalArgumentException("컬렉션이 비었음.");

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }

        return result;
    }
}
