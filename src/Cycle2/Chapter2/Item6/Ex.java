package Cycle2.Chapter2.Item6;

public class Ex {

    private static long sum() {
        Long sum = 0L;
        for (long i=0; i<Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }

    private static long sum2() {
        long sum = 0L;
        for (long i=0; i<Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        long currentTime = System.nanoTime();
        System.out.println(sum());
        System.out.println((System.nanoTime() - currentTime) / 1000000000.0);

        long currentTime2 = System.nanoTime();
        System.out.println(sum2());
        System.out.println((System.nanoTime() - currentTime2) / 1000000000.0);

        // 대략 10.5 배의 시간 차이가 발생. (pc 성능마다 다름)
    }
}
