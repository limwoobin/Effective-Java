package Cycle2.Chapter4.Item23;

public class Circle extends Figure2 {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}
