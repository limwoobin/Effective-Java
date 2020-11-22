package Cycle2.Chapter6.Item38;

import java.util.Arrays;
import java.util.Collection;

public class Test {
    private static <T extends Enum<T> & Operation> void test(
            Class<T> opEnumType , double x , double y
    ) {
        for (Operation op : opEnumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n" , x , op , y , op.apply(x , y));
        }
    }

    private static void test2(Collection<? extends Operation> opSet , double x , double y) {
        for (Operation op : opSet) {
            System.out.printf("%f %s %f = %f%n" , x , op , y , op.apply(x , y));
        }
    }

    private static void extendedTest(Operation op , double x , double y) {
        System.out.printf("%f %s %f = %f%n" , x , op , y , op.apply(x , y));
    }

    public static void main(String[] args) {
        double x = 4.0;
        double y = 5.5;
        test(ExtendedOperation.class , x , y);

        System.out.println("--------------------------------");

        test2(Arrays.asList(ExtendedOperation.values()) , x , y);

        System.out.println("--------------------------------");
        extendedTest(ExtendedOperation.EXP , x , y);
        extendedTest(ExtendedOperation.REMAINDER , x , y);
    }
}
