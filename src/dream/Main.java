package dream;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Player p1=new HumanPlayer("jobs");
        Player p2=new HumanPlayer("leo");
        Player p3=new HumanPlayer("max");

        Round round = new Round();
        round.setShowCards(
                Arrays.asList(
                        new ShowCard(p1, new Card(Card.Suit.HEART, Card.Rank.FIVE)),
                        new ShowCard(p2, new Card(Card.Suit.SPADE, Card.Rank.FIVE)),
                        new ShowCard(p3, new Card(Card.Suit.SPADE, Card.Rank.ACE))
                ));

        round.compareCard();
        System.out.println(p2.getPoint());
        System.out.println(p2.getPoint());

//        ShowCard showCard = ShowCard.showCardCompareMax(new ShowCard(new HumanPlayer("jobs"), new Card(Card.Suit.HEART, Card.Rank.FIVE)),
//                new ShowCard(new HumanPlayer("leo"), new Card(Card.Suit.SPADE, Card.Rank.FIVE)));
//        System.out.printf("name= %s ,suit =  %s , rank = %s", showCard.getPlayer().getName(), showCard.getCard().getSuit(), showCard.getCard().getRank());

//                new ShowCard(new HumanPlayer("leo"),new Card(Card.Suit.SPADE,Card.Rank.THREE))
//        Card card=Card.cardCompareMax(new Card(Card.Suit.HEART,Card.Rank.FIVE),new Card(Card.Suit.SPADE,Card.Rank.THREE));
//        System.out.printf("suit =  %s , rank = %s",card.getSuit(),card.getRank());


//        List<Card> list=Deck.getCards();
//        System.out.println(list.size());
//        list.stream().forEach(card->{
//
//            System.out.printf("suit= %s , rank= %s 。 \n",card.getSuit(),card.getRank());
//        } );

    }
}
