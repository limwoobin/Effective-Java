package Chapter4.Item15;

// 나쁜 클래스의 예 (변수가 public 으로 선언)
class Point {
    public double x;
    public double y;
}

// 좋은 클래스 (필드를 모두 private 으로 선언하고 public 접근자를 추가)
class Point2 {
    private double x;
    private double y;

    public double getX() { return x; }

    public void setX(double x) { this.x = x; }

    public double getY() { return y; }

    public void setY(double y) { this.y = y; }
}