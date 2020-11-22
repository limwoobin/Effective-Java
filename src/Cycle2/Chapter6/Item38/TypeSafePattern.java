package Cycle2.Chapter6.Item38;

// 타입 안전 열거 패턴의 예시
public class TypeSafePattern {
    private final String type;

    private TypeSafePattern(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    public static final TypeSafePattern terminal = new TypeSafePattern("Terminal");
    public static final TypeSafePattern process = new TypeSafePattern("process");
    public static final TypeSafePattern decision = new TypeSafePattern("decision");
}
