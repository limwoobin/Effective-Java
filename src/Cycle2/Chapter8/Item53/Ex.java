package Cycle2.Chapter8.Item53;

public class Ex {
    // 간단한 가변인수 활용 예
    static int sum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }

        return sum;
    }

    // 인수가 1개 이상이어야 하는 가변인수 메서드 - 잘못 구현한 예 (런타임시에 에러 발생)
    static int min(int... args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("인수가 1개 이상 필요");
        }
        int min = args[0];
        for (int i=1; i<args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }

        return min;
    }

    // 인수가 1개 이상이어야 할 때 가변인수를 제대로 사용하는 방법
    static int min2(int firstArg , int... args) {
        int min = firstArg;
        for (int arg : args) {
            if (arg < min) {
                min = arg;
            }
        }

        return min;
    }
}
