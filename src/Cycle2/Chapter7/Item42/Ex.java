package Cycle2.Chapter7.Item42;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex {
    public static List<String> words = Arrays.asList("z" , "zz" , "zzz");


    // 익명 클래스의 인스턴스를 함수 객체로 사용 - 낡은 기법!
    static void test() {
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length() , o2.length());
            }
        });
    }

    // 람다식을 함수 객체로 사용 - 익명 클래스 대체
    static void test2() {
        Collections.sort(words ,
                Comparator.comparingInt(String::length));
    }
}
