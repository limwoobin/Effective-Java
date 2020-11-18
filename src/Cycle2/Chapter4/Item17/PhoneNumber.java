package Cycle2.Chapter4.Item17;

public final class PhoneNumber {
    private final short areaCode , prefix , lineNum;

    private PhoneNumber(int areaCode , int prefix , int lineNum) {
        this.areaCode = rangeCheck(areaCode , 999 , "지역 코드");
        this.prefix = rangeCheck(prefix , 999 , "프리 픽스");
        this.lineNum = rangeCheck(lineNum , 9999 , "가입자 번호");
    }

    public static PhoneNumber valueOf(int areaCode , int prefix , int lineNum) {
        return new PhoneNumber(areaCode, prefix, lineNum);
    }

    private static short rangeCheck(int val , int max , String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }

        return (short)val;
    }

    @Override
    public int hashCode() {
        int result = Short.hashCode((short) areaCode);
        result = 31 * result + Short.hashCode((short) prefix);
        result = 31 * result + Short.hashCode((short) lineNum);
        return result;
    }
}
