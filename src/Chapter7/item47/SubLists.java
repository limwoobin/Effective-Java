package Chapter7.item47;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 입력 리스트의 모든 부분리스트를 스트림으로 반환한다.
public class SubLists {
    public static <E> Stream<List<E>> of(List<E> list) {
        return Stream.concat(Stream.of(Collections.emptyList()),
            prefixes(list).flatMap(SubLists::suffixes));
    }

    private static <E> Stream<List<E>> prefixes(List<E> list) {
        return IntStream.rangeClosed(1 , list.size())
                .mapToObj(end -> list.subList(0 , end));
    }

    private static <E> Stream<List<E>> suffixes(List<E> list) {
        return IntStream.range(0 , list.size())
                .mapToObj(start -> list.subList(start , list.size()));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A" , "B" , "C" , "D");
        prefixes(list).forEach(System.out::println);
        System.out.println();
        suffixes(list).forEach(System.out::println);
        System.out.println();
        of(list).forEach(System.out::println);
    }
}
