package Cycle1.Chapter7.item48;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(pi(100));
        System.out.println(parallelPi(100));
    }

    // 소수 계산 파이프라인 -> 병렬화에 적합
    static long pi(long n) {
        return LongStream.rangeClosed(2 , n)
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }

    static long parallelPi(long n) {
        return LongStream.rangeClosed(2 , n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }
}
