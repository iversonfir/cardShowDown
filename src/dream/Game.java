package dream;

import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * player沒有寫就給他變成AI機器人
 * 其實我覺得Player初始化不需要給順序
 * new Game(Arrays.asList(new Player("Jobs"),new Player("Max")))
 */
public class Game {
    private List<Player> players;
    private List<Round> rounds;

    public Game(List<Player> players) {
        setPlayers(players);
    }


    public void startGame() {
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
        drawDeckCard(players);

        //執行13Round

    }

    public void drawDeckCard(List<Player> plays) {
        //抽取卡片列表至手牌中
        List<Card> cards = Deck.getCards();


        System.out.println("抽牌結束，每人有13張手牌");

    }



    public Player comparePointAndDisplayWinner(){

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
