package Cycle2.Chapter5.Item33;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

// asSubclass 를 사용해 한정적 타입 토큰을 안전하게 형변환한다.
public class asSubclass {
    static Annotation getAnnotation(AnnotatedElement element , String annotationTypeName) {
        Class<?> annotationType = null;     // 비한정적 타입 토큰
        try {
            annotationType = Class.forName(annotationTypeName);
        } catch (Exception ex) {
            throw new AssertionError();
        }

        return element.getAnnotation(annotationType.asSubclass(Annotation.class));
    }
}
