package Cycle2.Chapter6.Item36;

// 비트 필드 열거 상수 >> 구닥다리 기법!
public class Text {
    public static final int STYLE_BOLD             = 1 << 0;
    public static final int STYLE_ITALIC           = 1 << 1;
    public static final int STYLE_UNDERLINE        = 1 << 2;
    public static final int STYLE_STRIKETHROUGH    = 1 << 3;

    public void applyStatus(int styles) {

    }
}
