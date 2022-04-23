package dream;

import static dream.ValidationUtils.lengthShouldBe;

/**
 * 初始化不必知道玩家順序
 */
public abstract class Player {
    private int point=0;
    private String name;
    private Order order;
    private Hand hand;
    private ExchangeHands exchangeHands;
    private ShowCard showCard;
    private CompareCard compareCard;
    public enum Order {
        P1, P2, P3, P4
    }

    public Player() {
    }

    public Player(String name) {
        setName(name);
    }


    public abstract  void choosePlayer();


    public void exchangeHands(Player player){

    }

    public ShowCard getShowCard() {
        return showCard;
    }

    public void setShowCard(ShowCard showCard) {
        this.showCard = showCard;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    public ExchangeHands getExchangeHands() {
        return exchangeHands;
    }

    public void setExchangeHands(ExchangeHands exchangeHands) {
        this.exchangeHands = exchangeHands;
    }

    public void setName(String name) {
        this.name = lengthShouldBe(name, 1, 20);
    }



    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public CompareCard getCompareCard() {
        return compareCard;
    }

    public void setCompareCard(CompareCard compareCard) {
        this.compareCard = compareCard;
    }
}
