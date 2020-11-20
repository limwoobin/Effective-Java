package Cycle2.Chapter4.Item23;

// 태그 달린 클래스 - 클래스 계층구조보다 훨씬 나쁘다.
public class Figure {
    enum Shape { RECTANGEL , CIRCLE }

    // 태그 필드
    final Shape shape;

    // RECTANGLE 에서만 쓰인다.
    double length;
    double width;

    // CIRCLE 에서만 쓰인다
    double radius;

    // CIRCLE 전용 생성자
    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    // RECTANGLE 전용 생성자
    Figure(double width , double length) {
        shape = Shape.RECTANGEL;
        this.width = width;
        this.length = length;
    }

    double area() {
        switch (shape) {
            case RECTANGEL:
                return width * length;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}
