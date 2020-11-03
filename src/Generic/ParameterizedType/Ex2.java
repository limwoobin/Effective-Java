package Generic.ParameterizedType;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        // before
        List<String> list = new ArrayList<>();
        list.add("HI");

        Object[] array = new Long[10];
        array[0] = 1L;

        // after
        ArrayList var1 = new ArrayList();
        var1.add("HI");
        Long[] var2 = new Long[10];
        var2[0] = 1L;
    }
}
