package chapter1.ex8;

import java.util.Objects;

public final class PhoneNumber {
    private final short areaCode , prefix , lineNum;

    public PhoneNumber(int areaCode , int prefix , int lineNum) {
        this.areaCode = rangeCheck(areaCode , 999 , "지역코드");
        this.prefix = rangeCheck(prefix , 999 , "프리픽스");
        this.lineNum = rangeCheck(lineNum , 999 , "가입자 번호");
    }

    private static short rangeCheck(int val , int max , String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }

        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }

        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        int result = Short.hashCode(areaCode);
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNum);
        return  result;

//        한줄짜리 hashcode method (성능이 살짝 아쉽다)
//        return Objects.hash(areaCode , prefix , lineNum);
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d" , areaCode , prefix , lineNum);
    }
}
