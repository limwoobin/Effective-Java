package Cycle2.Chapter6.Item37;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

// 중첩 EnumMap 으로 데이터와 열거 타입 쌍을 연결했다
public enum Phase2 {
    SOLID , LIQUID , GAS , PLASMA;

    public enum Transition {
        MELT(SOLID , LIQUID) , FREEZE(LIQUID , SOLID),
        BOIL(LIQUID , GAS) , CONDENSE(GAS , LIQUID),
        SUBLIME(SOLID , GAS) , DEPOSIT(GAS , SOLID),
        IONIZE(GAS , PLASMA) , DEIONIZE(PLASMA , GAS);


        private final Phase2 from;
        private final Phase2 to;

        Transition(Phase2 from , Phase2 to) {
            this.from = from;
            this.to = to;
        }

        private static final Map<Phase2 , Map<Phase2 , Transition>> m
                = Stream.of(values()).collect(groupingBy(t -> t.from,
                () -> new EnumMap<>(Phase2.class),
                toMap(t -> t.to , t -> t, (x , y) -> y , () -> new EnumMap<>(Phase2.class))));

        public static Transition from(Phase2 from , Phase2 to) {
            return m.get(from).get(to);
        }
    }
}
