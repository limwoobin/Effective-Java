package Cycle2.Chapter5.Item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser3<T> {
    private final List<T> choiceList;

    public Chooser3(Collection<T> choice) {
        this.choiceList = new ArrayList<>(choice);
    }

    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
