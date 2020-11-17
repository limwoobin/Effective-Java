import java.util.EnumSet;
import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {
        EnumSet<DATA> datas = EnumSet.noneOf(DATA.class);
        System.out.println(datas.size());
        System.out.println(datas.toString());

        Objects.requireNonNull(null);
    }

    private enum DATA {
        A , B , C
    }
}
