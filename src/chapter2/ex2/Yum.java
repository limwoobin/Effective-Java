package chapter2.ex2;

public class Yum {
    // 복사 생성자
    public Yum(Yum yum) {

    }

    // 복사 팩터리
    public static Yum newInstance(Yum yum) {
        return yum;
    }
}
