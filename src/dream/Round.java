package dream;

import java.util.List;

public class Round {

    private CompareCard compareCard;
    private List<Player> players;
    private List<ShowCard> showCards;

    public void start() {

    }

    public void DrawPlayerCard() {

    }

    public void showCard() {
    //player 從手排抽出
    // 通知 player 的showCard
    // 通知showCards
    }

    public void displayCard() {
//印出 showCards

    }

    public void compareCard() {
//比較showCards 點數最大的

      ShowCard showCard=  ShowCard.showCardCompareMax(showCards.get(0),showCards.get(1));
        showCard=ShowCard.showCardCompareMax(showCard,showCards.get(2));
//        showCard=ShowCard.showCardCompareMax(showCard,showCards.get(3));


//        ShowCard showCard=null;
//        for (int i = 0; i < showCards.size()-1; i++) {
//            if(i==0){
//                showCard=ShowCard.showCardCompareMax(showCards.get(i),showCards.get(i+1)) ;
//            }else {
//                showCard=ShowCard.showCardCompareMax(showCard,showCards.get(i+1));
//            }
//        }
         compareCard=new CompareCard(this,showCard.getPlayer());
         compareCard.addPoint();
    }

    public CompareCard getCompareCard() {
        return compareCard;
    }

    public void setCompareCard(CompareCard compareCard) {
        this.compareCard = compareCard;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<ShowCard> getShowCards() {
        return showCards;
    }

    public void setShowCards(List<ShowCard> showCards) {
        this.showCards = showCards;
    }
}
