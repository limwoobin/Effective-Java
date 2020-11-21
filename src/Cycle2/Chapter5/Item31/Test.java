package Cycle2.Chapter5.Item31;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        stack.pushAll(Arrays.asList(1,2,3,4,5));

        Collection<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);

        stack.popAll(objects);
    }
}
