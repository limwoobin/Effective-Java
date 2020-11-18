package Cycle2.Chapter4.Item16;

public class Point {
//    존나게 퇴보한 클래스 - 멤버변수가 public 이여서는 안된다.
//    public double x;
//    public double y;

//    접근자와 변경자 메서드를 활용해 데이터를 캡슐화
    private double x;
    private double y;

    public Point(double x , double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }

    public void setX(double x) { this.x = x; }

    public double getY() { return y; }

    public void setY(double y) { this.y = y; }
}
