package Cycle1.Chapter5.Item30;

import java.util.HashSet;
import java.util.Set;

public class Union {
    // 로 타입 사용 - 수용 불가
    public static Set union(Set s1 , Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    public static <E> Set<E> union2(Set<E> s1 , Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("A");
        s1.add("B");
        s1.add("C");

        Set<String> s2 = new HashSet<>();
        s2.add("1");
        s2.add("2");
        s2.add("3");

        Set<String> s3 = union2(s1 , s2);
        System.out.println(s3);
    }
}
