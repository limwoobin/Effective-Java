package Cycle2.Chapter6.Item39;

import java.lang.annotation.*;

// 반복 가능한 애너테이션 타입
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ExceptionTestContainer.class)
public @interface ExceptionTest2 {
    Class<? extends Throwable> value();
}
