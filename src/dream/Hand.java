package dream;

import java.util.List;

public class Hand {
    private Player Player;
    private List<Card> cards;

    public Hand(dream.Player player) {
        Player = player;
    }

    public Hand(dream.Player player, List<Card> cards) {
        Player = player;
        this.cards = cards;
    }

    public dream.Player getPlayer() {
        return Player;
    }

    public void setPlayer(dream.Player player) {
        Player = player;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }


}
