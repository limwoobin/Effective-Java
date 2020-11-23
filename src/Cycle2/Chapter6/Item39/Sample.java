package Cycle2.Chapter6.Item39;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    @ExceptionTest({ IndexOutOfBoundsException.class ,
    NullPointerException.class })
    public static void doublyBad() {    // 성공해야 한다
        List<String> list = new ArrayList<>();

        // 자바 API 명세에 따르면 다음 메서드는 IndexOutOfBoundsException 이나
        // NullPointerException 을 더질 수 있다.
        list.addAll(5 , null);
    }
}
