package CardGame_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> deckOfCards = new ArrayList<>(); //refacturer senere (lav den om til private eller noget).

    public Deck() {
        for (Card.Suits suit : Card.Suits.values()) {
            for (int i = 1; i < 14; i++) {
                deckOfCards.add(new Card(i, suit.name()));
            }
        }
    }

    public void addCard(Card card) {
        deckOfCards.add(card);
    }

    public void removeCard(Card card) {
        deckOfCards.remove(card);
    }

    public Card getRandomCard() {
        Random random = new Random();

        int index = random.nextInt(deckOfCards.size());
        Card drawnCard = deckOfCards.get(index);

        return drawnCard;
    }
}



