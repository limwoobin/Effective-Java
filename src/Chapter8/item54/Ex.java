package Chapter8.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex {

    private final List<String> stringInStock = new ArrayList<>();

    // 컬렉션이 비엇으면 Null 을 반환 -> 따라하지 말것
    // -> Null 을 처리하는 코드를 추가로 작성해야함
    public List<String> getStrings() {
        return stringInStock.isEmpty() ? null
                : new ArrayList<>(stringInStock);
    }

    // 빈 컬렉션을 매번 새로 할당하지 않기 위해 빈 '불변' 컬렉션을 반환 (최적화)
    public List<String> getStrings2() {
        return stringInStock.isEmpty() ? Collections.emptyList()
                : new ArrayList<>(stringInStock);
    }

    // 길이가 0일수도 있는 배열을 반환하는 올바른 방법
    public String[] getStrings3() {
        return stringInStock.toArray(new String[0]);
    }

    // 최적화 - 빈 배열을 매번 새로 할당하지 않도록 했다.
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    public String[] getStrings4() {
        return EMPTY_STRING_ARRAY;
    }

    // 나쁜 예 - 배열을 미리 할당하면 성능이 나빠짐
    public String[] getStrings5() {
        return stringInStock.toArray(new String[stringInStock.size()]);
    }

    public static void main(String[] args) {

    }
}
