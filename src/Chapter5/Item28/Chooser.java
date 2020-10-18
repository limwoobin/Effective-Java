package Chapter5.Item28;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

// Chooser - 제네릭을 적용해야 한다
public class Chooser {
    private final Object[] choiceArray;

    public Chooser(Collection choices) {
        this.choiceArray = choices.toArray();
    }

    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }
}


// Chooser 를 제네릭으로 만듬 , 하지만 T가 무슨 타입인지 알 수 없어
// 런타임시 안전하지 않다는 경고가 뜬다
class Chooser2<T> {
    private final T[] choiceArray;

    public Chooser2(Collection<T> choices) {
        this.choiceArray = (T[]) choices.toArray();
    }
}


// List 기반 Choose 구현 - 타입 안정성 확보
class Chooser3<T> {
    private final List<T> choiceArray;

    public Chooser3(Collection<T> choices) {
        this.choiceArray = new ArrayList<>(choices);
    }

    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray.get(rnd.nextInt(choiceArray.size()));
    }
}