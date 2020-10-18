package Chapter2.Item2;

// 정적 팩터리 방식의 싱글턴
public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();
    private Elvis2() {

    }

    public static Elvis2 getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {}

    // 싱글턴임을 보증해주는 readResolve 메소드
    private Object readResolve() {
        // '진짜' Elvis 를 반환하고 , 가짜 Elvis 는 가비지컬렉터에 맡긴다.
        return INSTANCE;
    }
}
