package Chapter8.item50;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start , end);
        p.end.setTime(78); // p 의 내부 공격 및 변경
    }
}
