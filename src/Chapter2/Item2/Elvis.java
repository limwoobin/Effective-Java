package Chapter2.Item2;

// public staic final 방식의 싱글턴
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {

    }

    public void leaveTheBuilding() {}
}
