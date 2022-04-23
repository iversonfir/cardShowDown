package dream;

public class CompareCard {
    private Round round;
    private Player player;


    public CompareCard(Round round, Player player) {
        this.round = round;
        this.player = player;
    }

    public void addPoint(){
        player.setPoint(player.getPoint()+1);
    }


    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
