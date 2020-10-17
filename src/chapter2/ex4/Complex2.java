package chapter2.ex4;

public class Complex2 {
    private final double re;
    private final double im;

    private Complex2(double re , double im) {
        this.re = re;
        this.im = im;
    }

    // 정적 팩터리
    public static Complex2 valueOf(double re , double im) {
        return new Complex2(re , im);
    }
}