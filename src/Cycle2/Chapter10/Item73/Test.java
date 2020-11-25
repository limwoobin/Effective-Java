package Cycle2.Chapter10.Item73;

public class Test {
    // 예외 번역 - 추상화 수준에 맞게 번역
    static void exceptionTest1() throws HighLevelException {
        try {
            throw new LowLevelException();
        } catch (LowLevelException cause) {
            throw new HighLevelException();
        }
    }

    // 예외 연쇄 - 저수준 예외를 고수준 예외에 실어 보낸다.
    static void exceptionTest2() throws HighLevelException {
        try {
            throw new LowLevelException();
        } catch (LowLevelException cause) {
            throw new HighLevelException(cause);
        }
    }

    public static void main(String[] args) throws HighLevelException {
        exceptionTest1();
        exceptionTest2();
    }
}
