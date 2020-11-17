package Cycle2.Chapter3.Item10;

public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x , int y , Color color) {
        super(x , y);
        this.color = color;
    }

    private enum Color {
        BLUE , BLACK , RED
    }

    // 잘못된 코드 - 대칭성 위배.
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }
        return super.equals(o) && ((ColorPoint) o).color == color;
    }

    // 잘못된 코드 - 추이성 위배
    public boolean equals2(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }

        // o가 일반 Point면 색상을 무시하고 비교
        if (!(o instanceof ColorPoint)) {
            return o.equals(this);
        }
        
        return super.equals(o) && ((ColorPoint) o).color == color;
    }
}
