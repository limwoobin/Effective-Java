package Cycle2.Chapter8.Item50;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();

        // Perion 인스턴스 내부 공격
        Period period = new Period(start , end);
        end.setYear(87);


        // Period 인스턴스를 향한 두번째 공격
        Period2 period2 = new Period2(start , end);
        period2.getEnd().setYear(78);
    }
}
