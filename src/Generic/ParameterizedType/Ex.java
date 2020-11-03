package Generic.ParameterizedType;

import java.util.ArrayList;
import java.util.List;

public class Ex {

    // 컴파일 전
    List<String> list = new ArrayList<>();

    // 컴파일 후
    ArrayList list2 = new ArrayList();
}
