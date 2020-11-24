package Cycle2.Chapter7.Item46;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Ex2 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "Apple", "apple", "banana", "What", "Who", "who",
                "Banana", "Orange", "orange", "Hello", "may", "orange",
                "hello", "who", "what", "what", "Apple", "who", "apple"
        );

        Map<String , Long> freq;
        freq = stringList.stream().collect(groupingBy(String::toLowerCase , counting()));

        // toList - 가장 흔한 단어 10개 뽑기
        List<String> topTen = freq.keySet().stream()
                                .sorted(comparing(freq::get).reversed())
                                .limit(10)
                                .collect(toList());

        System.out.println(topTen.toString());


        // toSet
        Map<String , Set<String>> collect = stringList.stream().collect(
                groupingBy(String::toLowerCase , toSet()));
        System.out.println(collect.toString());

        Map<String , Set<String>> collect2 = stringList.stream().collect(
                groupingBy(fruit -> fruit , toCollection(HashSet::new)));
        System.out.println(collect2.toString());
    }
}
