package Cycle2.Chapter5.Item31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<E> {
    private List<E> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(E e) {
        elements.add(e);
    }

    public E pop() {
        if (elements.size() == 0) throw new EmptyStackException();
        int lastIndex = elements.size() - 1;
        E result = elements.get(lastIndex);
        elements.remove(lastIndex);
        return result;
    }

    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            E e = pop();
            System.out.println("e: " + e);
            dst.add(e);
        }
    }

    public int size() {
        return elements.size();
    }

    private boolean isEmpty() {
        return elements.size() == 0;
    }
}
