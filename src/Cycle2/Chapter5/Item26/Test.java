package Cycle2.Chapter5.Item26;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Object> objects = Arrays.asList("x" , "xx" , "xxx");
        List<String> strings = Arrays.asList("z" , "zz" , "zzz");

        genericTest(objects);
//        genericTest(strings); -> error : 제네릭 타입에서의 String은
//        Object 의 하위타입으로 정의되는것이 아닌 별개의 타입으로 정의됨.
    }

    public static void genericTest(List<Object> objects) {
        System.out.println(objects.toString());
    }
}
