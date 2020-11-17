package Cycle2.Chapter2.item5;

import java.util.List;

// 정적 유틸리티를 잘못 사용한 예 - 유연하지 않고 테스트하기 어려움
public class SpellChecker {
    private static final Lexicon dictionary = new Lexicon();

    private SpellChecker() {}   // 객체 생성 방지

    public static boolean isValid(String word) {
        return false;
    }
    public static List<String> suggestions(String typo) {
        return null;
    }
}


// 싱글턴을 잘못 사용한 경우
class SpellChecker2 {
    private final Lexicon dictionary = new Lexicon();

    private SpellChecker2() {}
    public static SpellChecker2 INSTANCE = new SpellChecker2();

    public static boolean isValid(String word) {
        return false;
    }
    public static List<String> suggestions(String typo) {
        return null;
    }
}