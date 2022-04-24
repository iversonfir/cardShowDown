package dream;

import java.util.Arrays;
import java.util.List;

public class Card {
    private Rank rank;
    private Suit suit;

    public Card() {}
    public Card(Suit suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public static Boolean cardCompareMax(Card card, Card card2) {
        int rankVal = card.getRank().getValue();
        int rank2Val = card2.getRank().getValue();

        if (rankVal > rank2Val) {
            return true;
        }
        if (rankVal < rank2Val) {
            return  false;
        }

        if (suitCompareMax(card.getSuit(), card2.getSuit())) {
                return  true;
        }
        return false;
    }

    private static Boolean suitCompareMax(Suit suit, Suit suit2) {
        if (suit.getValue() < suit2.getValue()) {
            return false;
        }
        return true;
    }

    public enum Rank {
        TWO("2", 2), THREE("3", 3),
        FOUR("4", 4), FIVE("5", 5),
        SIX("6", 6), SEVEN("7", 7),
        EIGHT("8", 8), NINE("9", 9),
        TEN("10", 10), JACK("J", 11),
        QUEEN("Q", 12), KING("K", 13),
        ACE("A", 14);
        private final String name;
        private final int value;

        Rank(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }

    }


    public enum Suit {
        CLUB("梅花", 1), DIAMOND("菱形", 2),
        HEART("愛心", 3), SPADE("黑桃", 4);
        private final String name;
        private final int value;

        Suit(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }
    }


    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
