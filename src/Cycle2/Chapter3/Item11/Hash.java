package Cycle2.Chapter3.Item11;

public class Hash {
    private int value1;
    private int value2;
    private int value3;

    public Hash(int value1 , int value2 , int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    @Override
    public int hashCode() {
        int result = Short.hashCode((short) value1);
        result = 31 * result + Short.hashCode((short) value2);
        result = 31 * result + Short.hashCode((short) value3);
        return result;
    }
}
