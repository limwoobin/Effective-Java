package Cycle1.Chapter8.item55;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

public class Ex {
    // 컬렉션에서 최대값을 구한다(컬렉션이 비었으면 예외를 던진다.)
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty()) {
            throw new IllegalArgumentException("빈 컬렉션");
        }

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }

        return result;
    }

    // 컬렉션에서 최댓값을 구해 Optional<E> 로 반환한다.
    public static <E extends Comparable<E>> Optional<E> max2(Collection<E> c) {
        if (c.isEmpty()) {
            return Optional.empty();
        }

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }

        return Optional.of(result);
    }

    // 스트림을 사용한 버전
    public static <E extends Comparable<E>> Optional<E> max3(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        Objects.requireNonNull(null);
    }
}
