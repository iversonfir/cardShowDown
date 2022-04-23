package dream;

public class HumanPlayer extends Player{
    public HumanPlayer(String name) {
        super(name);
    }


    @Override
    public void choosePlayer() {
        System.out.printf("human");
    }
}
