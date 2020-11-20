package Cycle2.Chapter4.Item19;

public class Super {
    public Super() {
        // 잘못된 예 - 생성자가 오버라이딩 가능 메서드를 호출.
        overrideMe();
    }

    public void overrideMe() {
    }
}
