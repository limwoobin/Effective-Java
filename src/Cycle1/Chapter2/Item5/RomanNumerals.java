package Cycle1.Chapter2.Item5;

public class RomanNumerals {
    // 성능 개선 전
//    static boolean isRomanNumeral(String s) {
//        return s.matches("^(?=.)M*(C[MD]|D?C{o,3})"
//                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
//    }
//
//
//    private static final Pattern ROMAN = Pattern.compile(
//            "^(?=.)M*(C[MD]|D?C{o,3})"
//            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
//    // 성능 개선 후
//    static boolean isRomanNumeral2(String s) {
//        return ROMAN.matcher(s).matches();
//    }

    private static long sum() {
        Long sum = 0L;
//        long sum = 0l;  --> Auto UnBoxing 과정이 생략되기때문에 위보다 배는 더 빠르다.

        for (long i=0; i<=Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
