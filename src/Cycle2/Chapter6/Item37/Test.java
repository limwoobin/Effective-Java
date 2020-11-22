package Cycle2.Chapter6.Item37;

import java.util.*;

import static Cycle2.Chapter6.Item37.Plant.LifeCycle;

public class Test {
    public static void main(String[] args) {
        Plant[] garden = {
                new Plant("바질", LifeCycle.ANNUAL),
                new Plant("캐러웨이", LifeCycle.BIENNIAL),
                new Plant("딜", LifeCycle.ANNUAL),
                new Plant("라벤더", LifeCycle.PERENNIAL),
                new Plant("파슬리", LifeCycle.BIENNIAL),
                new Plant("로즈마리", LifeCycle.PERENNIAL)
        };

        // ordinal 을 배열 인덱스로 사용 - 따라 하지 말 것
        Set<Plant>[] plantsByLifeCycle = new Set[LifeCycle.values().length];
        for (int i=0; i< plantsByLifeCycle.length; i++) {
            plantsByLifeCycle[i] = new HashSet<>();
        }

        for (Plant p : garden) {
            plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
        }

        // 결과 출력
        for (int i=0; i< plantsByLifeCycle.length; i++) {
            System.out.printf("%s: %s%n" , LifeCycle.values()[i] , plantsByLifeCycle[i]);
        }

        System.out.println("----------------------------------------");

        // EnumMap 을 사용해 데이터와 열거 타입을 매핑
        Map<LifeCycle , Set<Plant>> plantsByLifeCycle2 = new EnumMap<>(LifeCycle.class);
        for (LifeCycle lc : LifeCycle.values()) {
            plantsByLifeCycle2.put(lc , new HashSet<>());
        }
        for (Plant p : garden) {
            plantsByLifeCycle2.get(p.lifeCycle).add(p);
        }

        // 결과 출력
        for (Map.Entry<LifeCycle , Set<Plant>> entry : plantsByLifeCycle2.entrySet()) {
            System.out.println(entry.toString());
        }

        System.out.println("----------------------------------------");
    }
}
