package Cycle2.Item6;

import java.util.regex.Pattern;

public class RomanNumerals {
    static boolean isRomanNumeral(String s) {

        // 아래 코드는 성능이 중요한 상황에서 반복해서 사용하는것은 좋지 않음
        // matchs 는 내부적으로 Pattern 인스턴스를 한번 쓰고 버려버리기 때문.
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // 패턴 객체를 재사용해 성능 개선.
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral2(String s) {
        return ROMAN.matcher(s).matches();
    }
}
