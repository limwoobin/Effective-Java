package Cycle2.Chapter4.Item17;

// 생성자대신 정적팩터리를 사용한 불변 클래스
public class Complex2 {
    private final double re;
    private final double im;

    private Complex2(double re , double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex2 valueOf(double re , double im) {
        return new Complex2(re , im);
    }
}
