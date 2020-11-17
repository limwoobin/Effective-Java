package Cycle1.Chapter6.item34;

import static Cycle1.Chapter6.item34.PayrollDay2.PayType.WEEKDAY;
import static Cycle1.Chapter6.item34.PayrollDay2.PayType.WEEKEND;

// 전략 열거 타입 패턴
public enum PayrollDay2 {
    MONDAY(WEEKDAY) , TUESDAY(WEEKDAY) , WEDNESDAY(WEEKDAY) , THURSDAY(WEEKDAY) , FRIDAY(WEEKDAY),
    SATURDAY(WEEKEND) , SUNDAY(WEEKEND);

    private final PayType payType;

    PayrollDay2(PayType payType) {
        this.payType = payType;
    }

    int pay(int minutesWorked , int payRate) {
        return payType.pay(minutesWorked , payRate);
    }

    enum PayType {
        WEEKDAY {
            @Override
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked <= MINS_PER_SHIFT ? 0
                        : (minsWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            @Override
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked * payRate / 2;
            }
        };

        abstract int overtimePay(int minsWorked , int payRate);

        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minsWorked , int payRate) {
            int basePay = minsWorked * payRate;
            return basePay +  overtimePay(minsWorked , payRate);
        }
    }
}
