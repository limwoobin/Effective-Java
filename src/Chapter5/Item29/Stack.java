package Chapter5.Item29;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

// Stack 에 제네릭 적용
public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        elements[size++] = e;
    }

    //    올바른 pop 메서드
    public E pop() {
        if (size == 0) throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements , 2 * size + 1);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A" , "B" , "C" , "D");
        Stack<String> stack = new Stack<>();
        for (String s : list) {
            stack.push(s);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
