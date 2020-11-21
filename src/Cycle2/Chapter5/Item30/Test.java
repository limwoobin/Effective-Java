package Cycle2.Chapter5.Item30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> guys = new HashSet<>();
        guys.addAll(Arrays.asList("톰" , "딕" , "해리"));

        Set<String> stooges = new HashSet<>();
        stooges.addAll(Arrays.asList("래리" , "모에" , "컬리"));

        Set<String> aflCio = Ex.union2(guys , stooges);
        System.out.println(aflCio);
    }
}
