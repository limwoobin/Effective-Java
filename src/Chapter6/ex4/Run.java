package Chapter6.ex4;

public class Run {
    public static void main(String[] args) {
        double x = 150.0;
        double y = 23.0;
        test(ExtendedOperation.class , x , y);
    }

    static <T extends Enum<T> & Operation> void test(
            Class<T> opEnumType , double x , double y
    ) {
        for (Operation op : opEnumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n" , x , op , y , op.apply(x , y));
        }
    }
}
