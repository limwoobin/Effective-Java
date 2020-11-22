package Cycle2.Chapter6.Item34;

// 위험한 코드이다. (만약 주말외에 휴가기간에 일했을 경우엔 어떻게 될까?)
public enum PayrollDay {
    MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY,
    SATURDAY , SUNDAY;

    private static final int MINS_PER_SHIFT = 8 * 60;

    int pay(int minutesWorked , int payRate) {
        int basePay = minutesWorked * payRate;

        int overtimePay;
        switch (this) {
            case SATURDAY: case SUNDAY: // 주말
                overtimePay = basePay / 2;
                break;
            default:
                overtimePay = minutesWorked <= MINS_PER_SHIFT ?
                        0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
        }

        return basePay + overtimePay;
    }
}
