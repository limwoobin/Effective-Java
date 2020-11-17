package Cycle1.Chapter9.item62;

// Key 클래스로 권한을 구분함
public class ThreadLocal2 {
    private ThreadLocal2() { }

    // 권한
    public static class Key {
        Key() { }

        // 위조 불가능한 고유 키를 생성
        public static Key getKey() {
            return new Key();
        }
    }

    public static void set(Key key, Object value) {

    }

    public static Object get(Key key) {
        return null;
    }
}
