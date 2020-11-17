package Cycle1.Chapter9.item61;

public class Unbelievable {
    static Integer i;

    static void intTest() {
        if (i == 42) {
            System.out.println("믿을 수 없다.");
        }
    }

    static void longTest() {
//        Long sum = 0L;
        long sum = 0l;
        for (long i=0; i<=Integer.MAX_VALUE; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        intTest();
        longTest();
    }
}
