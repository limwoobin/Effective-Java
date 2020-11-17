package Cycle1.Chapter9.item58;

import java.util.*;

public class Ex {
    enum Suit {
        CLUB , DIAMOND , HEART , SPADE;
    }

    enum Rank {
        ACE , DEUCE , THREE , FOUR , FIVE , SIX , SEVEN , EIGHT , NINE , TEN , JACK , QUEEN , KING;
    }

    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
//        i.next() 에서 에러 발생
//        for (Iterator<Suit> i = suits.iterator(); i.hasNext();) {
//            for (Iterator<Rank> j = ranks.iterator(); j.hasNext();) {
//                deck.add(new Card(i.next() , j.next()));
//            }
//        }

        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                deck.add(new Card(suit , rank));
            }
        }

        for (Card card : deck) {
            System.out.println(card.toString());
        }
    }
}
