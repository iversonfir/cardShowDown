package dream;

public class ShowCard {
    private Player player;
    private Card card;

    public ShowCard(Player player, Card card) {
        this.player = player;
        this.card = card;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
    public static ShowCard showCardCompareMax(ShowCard showCard,ShowCard showCard2){
        if(Card.cardCompareMax(showCard.getCard(),showCard2.getCard()))
            return showCard;
        return showCard2;
    }
}
