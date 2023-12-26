package CardGame_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Deck {
    List<Card> deckOfCards = new ArrayList<>();

    public Deck() {
        Card[] cards = new Card[52];

        int counter = 0;
        for (Card.Suits suit : Card.Suits.values()) {
            for (int i = 1; i < 14; i++) {
                cards[counter] = new Card(i,suit.name());
                counter++;
            }
        }

        System.out.println(Arrays.asList(cards));
    }
       /* for( int i = 0; i < 53; i++){
            int rank = 0;
            String suit = " ";
            Card card = new Card(rank, suit);
        }*/
    public void addCard(Card card){
        deckOfCards.add(card);
    }
}



