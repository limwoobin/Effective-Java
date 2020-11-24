package Cycle2.Chapter8.Item50;

import java.util.Date;

// 수정한 생성자 - 매개변수의 방어적 복사본을 사용한다.
public class Period2 {
    private final Date start;
    private final Date end;

    public Period2(Date start , Date end) {
        // 방어적 복사본을 만드는 코드
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(this.start + "가" + this.end + "보다 늦다.");
        }
    }

//    public Date getStart() {
//        return start;
//    }
//
//    public Date getEnd() {
//        return end;
//    }

    // 가변 필드의 방어적 복사본
    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }
}
