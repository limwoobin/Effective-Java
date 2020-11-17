package Cycle1.Chapter4.Item23;

// 태그 달린 클래스 (두 가지 이상의 기능을 커버하는 클래스) - 클래스 계층구조보다 훨씬 나쁨.
public class Figure {
    enum Shape { RECTANGE , CIRCLE };

    // 태그 필드 - 현재 모양을 나타냄
    final Shape shape;

    // 이 필드는 모양이 RECTANGE 일때만 쓰임
    double length;
    double width;

    // 이 필드는 모양이 CIRCLE 일때만 쓰임
    double radius;

    // CIRCLE 용 생성자
    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    // RECTANGLE 용 생성자
    Figure(double length , double width) {
        shape = Shape.RECTANGE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (shape) {
            case RECTANGE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}
