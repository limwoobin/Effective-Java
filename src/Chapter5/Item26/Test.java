package Chapter5.Item26;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings , 42);
        String s = strings.get(0);
        System.out.println(s);
    }

    static void unsafeAdd(List list , Object o) {
        list.add(o);
    }

    // 잘못된 예 - 모르는 타입의 원소도 받는 로 타입 사용
    static int numElementsInCommon(Set s1 , Set s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }

        return result;
    }

    // 비 한정적인 와일드카드 타입
    static int numElementsInCommon2(Set<?> s1 , Set<?> s2) {
        return 0;
    }
}
