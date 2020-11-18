package Cycle2.Chapter3.Item10;

// 전형적인 equals 메서드의 예
public final class PhoneNumber {
    private final short areaCode , prefix , lineNum;

    public PhoneNumber(int areaCode , int prefix , int lineNum) {
        this.areaCode = rangeCheck(areaCode , 999 , "지역 코드");
        this.prefix = rangeCheck(prefix , 999 , "프리 픽스");
        this.lineNum = rangeCheck(lineNum , 9999 , "가입자 번호");
    }

    private static short rangeCheck(int val , int max , String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }

        return (short)val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }

        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }
}
