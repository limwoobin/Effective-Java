package Cycle2.Chapter4.Item24;

// 정적 클래스 예제
public class Calculator {
    public enum Operator {
        PLUS("+" , (x , y) -> x + y),
        MINUS("-" , (x , y) -> x - y);

        private final String token;
        private final Strategy strategy;

        Operator(String token , Strategy strategy) {
            this.token = token;
            this.strategy = strategy;
        }

        public double operate(double x , double y) {
            return this.strategy.operate(x , y);
        }

        private interface Strategy {
            double operate(double x , double y);
        }
    }
}
