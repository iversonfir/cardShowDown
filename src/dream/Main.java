package dream;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player p1=new HumanPlayer("Jobs");
        Player p2=new HumanPlayer("Leo");
        Player p3=new HumanPlayer("Max");
        Player p4=new HumanPlayer("Rex");

        Game game=new Game(Arrays.asList(p1,p2,p3,p4));

        game.start();




    }
}
