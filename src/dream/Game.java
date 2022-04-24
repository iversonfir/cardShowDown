package dream;

import java.util.*;

import static java.util.Objects.requireNonNull;

/**
 * player沒有寫就給他變成AI機器人
 * 其實我覺得Player初始化不需要給順序
 * new Game(Arrays.asList(new Player("Jobs"),new Player("Max")))
 */
public class Game {
    private List<Player> players;
    private List<Round> rounds = new ArrayList<>();

    public Game(List<Player> players) {

        setPlayers(players);
    }


    public void start() {
        int playNum = players.size();

        //如果人數少於4人，就加入AI
//           while (playNum<4){
//
//           }
//賽入順序

        System.out.println("【遊戲開始】");
        for (Player player : players) {
            System.out.printf("加入遊戲 %s， 順序為 %s", player.getName(), player.getOrder());
        }

        //洗牌
        Deck.shuffle();
        drawDeckCard();

        //執行13Round
        for (int i = 0; i < 13; i++) {
            Round round = new Round(this);
            round.start();
            rounds.add(round);
        }
        comparePointAndDisplayWinner();

    }

    public void drawDeckCard() {
        //抽取卡片列表至手牌中
        List<Card> cards = Deck.getCards();

        for (Player play : players) {
            Hand hand = new Hand(play, new ArrayList<>());
            for (int i = 0; i < 13; i++) {
                int r = (int) (Math.random() * cards.size());
                hand.getCards().add(cards.get(r));
                cards.remove(r);
            }
            play.setHand(hand);
        }


        System.out.println("抽牌結束，每人有13張手牌");

    }


    public List<Player> comparePointAndDisplayWinner() {


        players.stream().forEach(a -> System.out.printf("%s %d \n", a.getName(), a.getPoint()));
        List<Player> winnerList=new ArrayList<>();

        Player player=compare(players.get(0),players.get(1));
        if(player==null){
            winnerList.add(players.get(0));
            winnerList.add(players.get(1));
        }else {
            winnerList.add(player);
        }

        Player player2=compare(players.get(2),players.get(3));
        if(player2==null){
            if(players.get(2).getPoint()>winnerList.get(0).getPoint()){
                winnerList.clear();
                winnerList.add(players.get(2));
                winnerList.add(players.get(3));
            }
             if(players.get(2).getPoint()==winnerList.get(0).getPoint()) {
                 winnerList.add(players.get(2));
                 winnerList.add(players.get(3));
             }

        }else {
            if(player2.getPoint()>winnerList.get(0).getPoint()){
                winnerList.clear();
                winnerList.add(player2);
            }

           else if(player2.getPoint()==winnerList.get(0).getPoint()){
                winnerList.add(player2);
            }

        }




        winnerList.stream().forEach(a->System.out.printf("贏家是 %s \n", a.getName()));
        return winnerList;
    }


    private Player compare(Player play1,Player play2){
            if(play1.getPoint()>play2.getPoint()){
                return play1;
            }
            if(play1.getPoint()<play2.getPoint()){
                return play2;
            }
        return null;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public void setPlayers(List<Player> players) {
        this.players = requireNonNull(players);
    }

    public List<Player> getPlayers() {
        return players;
    }
}
