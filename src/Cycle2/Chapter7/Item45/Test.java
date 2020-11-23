package Cycle2.Chapter7.Item45;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    // 데카르트 곱 계산을 반복 방식으로 구현
    private static List<Card> newDeck() {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit , rank));
            }
        }

        return cards;
    }


    // 데카르트 곱 계산을 스트림으로 구현
    private static List<Card> newDeck2() {
        return Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Rank.values())
                                    .map(rank -> new Card(suit , rank)))
                                    .collect(Collectors.toList());
    }

    // 이런 경우에는 본인이 편하게 생각하는 방식을 따르는게 낫다.
}
