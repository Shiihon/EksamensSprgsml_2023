package Opgave_3_CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> deckOfCards = new ArrayList<>(); //refacturer senere (lav den om til private eller noget).

    public Deck() {
        for (Card.Suits suit : Card.Suits.values()) { //hvor mange værdier jeg har i mit enum - 4 værdier, kører 4 gange.
            for (int i = 1; i < 14; i++) { //for hver suit laves der 13 kort.
                deckOfCards.add(new Card(i, suit));
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



