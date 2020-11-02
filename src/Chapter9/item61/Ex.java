package Chapter9.item61;

import java.util.Comparator;

public class Ex {

    // 잘못 구현된 비교자
    Comparator<Integer> naturalOrder = (i , j) -> (i < j) ? -1 : (i == j ? 0 : 1);

    // 문제를 수정한 비교자
    Comparator<Integer> naturalOrder2 = (iBoxed , jBoxed) -> {
        int i = iBoxed , j = jBoxed;
        return i < j ? -1 : (i == j ? 0 : 1);
    };
}
