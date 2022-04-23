package dream;

public class AIPlayer extends Player{
    public AIPlayer( String name) {
        super("AI");
    }

    @Override
    public void choosePlayer() {
        System.out.printf("AI");
    }
}
