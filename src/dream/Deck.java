package dream;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private static List<Card> cards;
//先創造出所有的卡片，放入liist 之後就可以隨機抽取


    public static List<Card> getCards() {
        cards=new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit,rank));
            }
        }
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public static void shuffle(){

        System.out.println("【洗牌】");
    }



}
