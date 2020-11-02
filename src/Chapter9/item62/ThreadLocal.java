package Chapter9.item62;

// 잘못된 예 -> 문자열을 사용해 권한을 구분하였음.
public class ThreadLocal {
    private ThreadLocal() { }

    // 현 스레드의 값을 키로 구분해 저장
    public static void set(String key, Object data) {

    }

    // 키가 가르키는 현 스레드의 값을 반환
    public static Object get(String key) {
        return null;
    }
}
