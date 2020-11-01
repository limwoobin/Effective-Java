package Chapter8.ex1;

import java.util.Date;

// 매개변수의 방어적 복사본을 만든다.
public class Period {
    public final Date start;
    public final Date end;

    public Period(Date start , Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (this.start.compareTo(this.end) > 0) {
            throw new IllegalArgumentException(this.start + "가 " + this.end + "보다 늦다.");
        }
    }

    // 필드의 방어적 복사본을 반환.
    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }
}
