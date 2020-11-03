package Generic.RecursiveTypeBound;

import java.util.Iterator;
import java.util.List;

public class Ex {
    // 재귀적 타입 바운드는 타입 매개변수가 자신을 포함하는 수식에 의해 한정될 수 있다.
    // <T extends Comparable<T>> 은 “자신과 비교될 수 있는 모든 타입 T”라고 읽을 수 있다.
    static <T extends Comparable<T>> T max(List<T> list) {
        Iterator<T> iterator = list.iterator();
        T result = iterator.next();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (t.compareTo(result) > 0) {
                result = t;
            }
        }

        return result;
    }
}
