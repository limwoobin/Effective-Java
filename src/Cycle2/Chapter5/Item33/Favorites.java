package Cycle2.Chapter5.Item33;

import java.util.*;

// 타입 안전 이종 컨테이너 패턴 - API
public class Favorites {
    private Map<Class<?> , Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type , T instance) {
        favorites.put(type , instance);
    }

    // 동적 형변환으로 타입 안정성 확보
    public <T> void putFavorite2(Class<T> type , T instance) {
        favorites.put(Objects.requireNonNull(type) , type.cast(instance));
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
        // 타입 안전 이종 컨테이너 패턴 - 클라이언트
        Favorites f = new Favorites();
        f.putFavorite(String.class , "Java");
        f.putFavorite(Integer.class , 0xcafebabe);
        f.putFavorite(Class.class , Favorites.class);
        f.putFavorite(String[].class , new String[]{"a", "b"});

        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);
        String[] favoriteStrings = f.getFavorite(String[].class);


        System.out.printf("%s %x %s%n" , favoriteString , favoriteInteger , favoriteClass.getName());
        System.out.println(favoriteStrings[0] + "," + favoriteStrings[1]);
    }
}
