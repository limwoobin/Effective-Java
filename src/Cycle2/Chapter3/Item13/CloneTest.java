package Cycle2.Chapter3.Item13;

public class CloneTest {

    // 가변 상태를 참조하지 않는 클래스용 clone 메서드.
    @Override
    protected CloneTest clone() {
        try {
            return (CloneTest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
