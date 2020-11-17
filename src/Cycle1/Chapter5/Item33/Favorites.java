package Cycle1.Chapter5.Item33;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites {
//    타입 안전 이종 컨테이너 패턴 - API
    public Map<Class<?> , Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type , T instance) {
        favorites.put(Objects.requireNonNull(type) , instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return (T) favorites.get(type);
    }

    public static void main(String[] args) {
        Favorites f = new Favorites();

        f.putFavorite(String.class , "Java");
        f.putFavorite(Integer.class , 0xcafebabe);
        f.putFavorite(Class.class , Favorites.class);

        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);

        System.out.printf("%s %x %s%n" , favoriteString , favoriteInteger , favoriteClass.getName());
    }

    // asSubclss 를 사용해 한정적 타입 토큰을 안전하게 형변환
    static Annotation getAnnotation(AnnotatedElement element , String annotationTypeName) {
        Class<?> annotationType = null;
        try {
            annotationType = Class.forName(annotationTypeName);
        } catch (Exception ex) {
            throw new IllegalArgumentException(ex);
        }

        return element.getAnnotation(annotationType.asSubclass(Annotation.class));
    }
}
