package Chapter9.item58;

public class Card {
    private Ex.Suit suit;
    private Ex.Rank rank;

    public Card(Ex.Suit suit , Ex.Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
