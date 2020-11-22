package Cycle2.Chapter6.Item34;

// 값에 따라 분기하는 열거타입 - 괜찮을까?
public enum Operation {
    PLUS , MINUS , TIMES , DIVIDE;

    public double apply(double x , double y) {
        switch (this) {
            case PLUS: return x + y;
            case MINUS: return x - y;
            case TIMES: return x * y;
            case DIVIDE: return x / y;
        }
        throw new AssertionError("알 수 없는 연산: " + this);
    }
}
