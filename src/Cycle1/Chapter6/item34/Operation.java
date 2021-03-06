package Cycle1.Chapter6.item34;

// 깨지기 쉬운 코드
public enum Operation {
    PLUS , MINUS , TIMES , DIVIDE;

    public double apply(double x , double y) {
        switch (this) {
            case PLUS: return x + y;
            case MINUS: return x - y;
            case TIMES: return x * y;
            case DIVIDE: return x / y;
        }

        throw new AssertionError("알 수 없는 연산:" + this);
    }
}
