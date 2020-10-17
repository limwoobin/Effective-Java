package Item6;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        elements[size++] = e;
    }

//    stack 을 삭제하는데 참조를 해제하지 않음
//    public Object pop() {
//        if (size == 0) throw new EmptyStackException();
//        return elements[--size];
//    }

//    올바른 pop 메서드
    public Object pop() {
        if (size == 0) throw new EmptyStackException();
        Object e = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
        return e;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements , 2 * size + 1);
        }
    }
}
