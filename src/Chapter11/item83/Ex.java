package Chapter11.item83;

import static Chapter11.item83.FieldType.computeFieldValue;

public class Ex {

    // 인스턴스 필드를 초기화하는 일반적인 방법.
    private final FieldType field = computeFieldValue();

    // 인스턴스 필드 지연 초기화 - synchronized 접근자 방식
    private FieldType field2;

    private synchronized FieldType getField() {
        if (field2 == null) {
            field2 = computeFieldValue();
        }

        return field2;
    }

    // 성능 때문에 정적필드를 지연 초기화 할 경우
    // 정적 필드용 지연 초기화 홀더 클래스 관용구
    private static class FieldHolder {
        static final FieldType field3 = computeFieldValue();
    }

    private static FieldType getField3() {
        return FieldHolder.field3;
    }

    // 성능 때문에 인스턴스 필드를 지연 초기화 할 경우
    // 인스턴스 필드 지연 초기화용 이중검사 관용구
    private volatile FieldType field4;

    private FieldType getField4() {
        FieldType result = field4;
        if (result != null) {   // 첫 번째 검사 (락 사용 안함)
            return result;
        }

        synchronized (this) {
            if (field4 == null) {   // 두 번째 검사 (락 사용 함)
                field4 = computeFieldValue();
            }

            return field4;
        }
    }
}


