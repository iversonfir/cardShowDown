package dream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Round {

    private CompareCard compareCard;
//    private List<Player> players;
    private List<ShowCard> showCards;
    private Game game;

    public Round(Game game) {
        this.game = game;
    }

    public void start() {
        drawPlayerCard();
        showCard();
        displayCard();
        compareCard();
    }

    public void drawPlayerCard() {
        for (int i = 0; i < game.getPlayers().size()-1; i++) {
            swapCard(game.getPlayers().get(i), game.getPlayers().get(i+1));
        }
        System.out.println("四人互相抽卡完畢");
    }

    private static void swapCard(Player player1, Player player2) {
        int r1 = (int) (Math.random() * player1.getHand().getCards().size());
        int r2 = (int) (Math.random() * player2.getHand().getCards().size());

        Card card1 = player1.getHand().getCards().get(r1);
        Card card2 = player2.getHand().getCards().get(r2);

        Card tempCard1 = new Card(card1.getSuit(), card1.getRank());
        Card tempCard2 = new Card(card2.getSuit(), card2.getRank());

        player1.getHand().getCards().set(r1, tempCard2);
        player2.getHand().getCards().set(r2, tempCard1);
    }

    /**
     * player 從手排抽出
     * 通知 player 的showCard
     * 通知showCards
     */
    public void showCard() {
        showCards = new ArrayList<ShowCard>();
        for (Player player : game.getPlayers()) {
            int r = (int) Math.random() * player.getHand().getCards().size();
            Card card = player.getHand().getCards().get(r);
            showCards.add(new ShowCard(player, card));
            player.getHand().getCards().remove(r);
        }
    }

    /**
     * 印出 showCards
     */
    public void displayCard() {
        showCards.stream().forEach(showCard -> System.out.printf(" %s 出牌 , suit %s , rank %s 。 \n",
                showCard.getPlayer().getName(),
                showCard.getCard().getSuit(),
                showCard.getCard().getRank()));
    }

    public void compareCard() {
        //比較showCards 點數最大的

        ShowCard showCard = ShowCard.showCardCompareMax(showCards.get(0), showCards.get(1));
        showCard = ShowCard.showCardCompareMax(showCard, showCards.get(2));
        showCard = ShowCard.showCardCompareMax(showCard, showCards.get(3));

        compareCard = new CompareCard(this, showCard.getPlayer());
        System.out.printf("%s 得分 \n", showCard.getPlayer().getName());
        compareCard.addPoint();
    }

    public CompareCard getCompareCard() {
        return compareCard;
    }

    public void setCompareCard(CompareCard compareCard) {
        this.compareCard = compareCard;
    }



    public List<ShowCard> getShowCards() {
        return showCards;
    }

    public void setShowCards(List<ShowCard> showCards) {
        this.showCards = showCards;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
