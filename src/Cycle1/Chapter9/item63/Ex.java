package Cycle1.Chapter9.item63;

import java.util.Arrays;
import java.util.List;

public class Ex {
    private static List<String> list = Arrays.asList("a" , "b" , "c" , "d");

    // 문자열 연결을 잘못 사용한 예 - 느리다!
    private static String example1() {
        String result = "";
        for (int i=0; i<list.size(); i++) {
            result += list.get(i);
        }

        return result;
    }

    // StringBuilder 를 사용해 문자열 연결 성능을 개선
    private static String example2() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<list.size(); i++) {
            stringBuilder.append(list.get(i));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(example1());
        System.out.println(example2());
    }
}
