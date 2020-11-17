package Cycle1.Chapter8.item55;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class OptionalEx {
    public static void main(String[] args) {
        Ex optionalEx = new Ex();

        List<String> words = Arrays.asList("a" , "b" , "c" , "d");

        // Optional 활용1 - 기본값을 정해둘 수 있다.
        String lastWordInLexion = Ex.max2(words).orElse("단어 없음.");
        System.out.println(lastWordInLexion);

        // Optional 활용2 - 원하는 예외를 던질 수 있다.
        String wordsException = Ex.max2(words).orElseThrow(EmptyStackException::new);
        System.out.println(wordsException);

        // Optional 활용3 - 항상 값이 채워져있다고 가정
        String data = Ex.max2(words).get();
        System.out.println(data);

    }
}
