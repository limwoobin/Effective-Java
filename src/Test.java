import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[][] arrays = new String[][]{ {"a1", "a2"}, {"b1", "b2"}, {"c1", "c2", "c3"} };

        Stream<String[]> stream4 = Arrays.stream(arrays);

        Stream<String> stream5 = stream4.flatMap(s -> Arrays.stream(s));

        stream5.forEach(System.out::println);
    }
}