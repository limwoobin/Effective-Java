package Cycle2.Chapter7.Item45;

import java.io.File;
import java.io.IOException;
import java.util.*;

// 사전 하나를 훑어 원소 수가 많은 아나그램 그룹들을 출력한다.
public class Anagrams {
    public static void main(String[] args) throws IOException {
        File dictionary = new File(args[0]);
        int minGroupSize = Integer.parseInt(args[1]);

        Map<String , Set<String>> groups = new HashMap<>();
        try (Scanner s = new Scanner(dictionary)) {
            while (s.hasNext()) {
                String word = s.next();
                groups.computeIfAbsent(alphabetize(word) , (unused) -> new TreeSet<>()).add(word);
            }
        }
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
