package Cycle2.Chapter2.item3;

// public static final 필드 방식의 싱글턴
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
}

// 정적 팩터리 방식의 싱글턴
class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();
    private Elvis2() {}
    public static Elvis2 getInstance() {
        return INSTANCE;
    }
}


// 열거 타입의 싱글턴 - 바람직
enum Elvis3 {
    INSTANCE;
}