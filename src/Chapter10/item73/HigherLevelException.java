package Chapter10.item73;

// 예외 연쇄용 생성자
public class HigherLevelException extends Exception {
    HigherLevelException(Throwable cause) {
        super(cause);
    }
}
