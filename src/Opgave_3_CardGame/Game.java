package Opgave_3_CardGame;

public class Game {
    private Deck deck;

    public Game() {
        this.deck = new Deck();
    }

    public Card drawCard() { // loop for at trække 7 gange.
        Card drawnCard = deck.getRandomCard();
        deck.removeCard(drawnCard); // efter kortet er trukket, fjernes det fra "bunken".
        return drawnCard;
    }

    public Card highest(Card card1, Card card2) {
        if (card1.getRank() < card2.getRank()) {
            return card2;
        } else if (card1.getRank() > card2.getRank()) {
            return card1;
        } else {
            return highestSuit(card1, card2);
        }
    }

    public Card highestSuit(Card card1, Card card2) {

        Card.Suits suitCard1 = card1.getSuit();
        Card.Suits suitCard2 = card2.getSuit();

        // henter værdiern af ENUM, via ordinal(), og sammenligner dem.
        if (suitCard1.ordinal() < suitCard2.ordinal()) {
            return card2;
        } else {
            return card1;
        }
    }
}
