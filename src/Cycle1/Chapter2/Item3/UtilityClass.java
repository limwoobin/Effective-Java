package Cycle1.Chapter2.Item3;

public class UtilityClass {
    // 기본 생성자가 만들어지는것을 막는다.(인스턴스화 방지)

    private UtilityClass() {
        throw new AssertionError();
    }
}
