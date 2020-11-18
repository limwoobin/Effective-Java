package Cycle2.Chapter3.Item10;

import java.util.Objects;

// Point 를 상속받지 않고 컴포지션으로 구현
public class ColorPoint2 {
    private final Point point;
    private final Color color;

    public ColorPoint2(int x , int y , Color color) {
        this.point = new Point(x , y);
        this.color = Objects.requireNonNull(color);
    }

    /*
    * 이 ColorPoint 의 Point 뷰를 반환
    * */
    public Point asPoint() {
        return this.point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint2)) {
            return false;
        }

        ColorPoint2 cp = (ColorPoint2) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
