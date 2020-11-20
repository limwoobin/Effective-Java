package Cycle2.Chapter4.Item23;

public class Rectangle extends Figure2 {
    private final double width;
    private final double length;

    public Rectangle(double width , double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {
        return width * length;
    }
}
