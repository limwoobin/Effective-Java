package Cycle2.Chapter5.Item28;

import java.util.Collection;

public class Chooser2<T> {
    private final T[] choiceArray;

    public Chooser2(Collection<T> choices) {
        this.choiceArray = (T[]) choices.toArray();
    }
}
