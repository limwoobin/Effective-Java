package Cycle2.Chapter7.Item46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Ex {
    public static void main(String[] args) throws IOException {
        Path dictionary = Paths.get(args[0]);

        // 스트림 패러다임을 이해하지 못한 채 API 만 사용함 - 따라 하지 말 것!
        Map<String , Long> freq = new HashMap<>();
        try (Stream<String> words = Files.lines(dictionary)) {
            words.forEach(word -> freq.merge(word.toLowerCase() , 1L , Long::sum));
        }


        // 스트림을 제대로 활용해 빈도표(freq) 를 초기화 한다.
        Map<String , Long> freq2;
        try (Stream<String> words = Files.lines(dictionary)) {
            freq2 = words.collect(groupingBy(String::toLowerCase , counting()));
        }
    }
}
