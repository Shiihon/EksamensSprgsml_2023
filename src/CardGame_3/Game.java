package CardGame_3;

public class Game {
    private Deck deck;

    public Game() {
        this.deck = new Deck();
    }

    public Card drawCard() {
        Card drawnCard = deck.getRandomCard();
        deck.removeCard(drawnCard);
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

        // laver String Suit om til ENUM.
        Card.Suits suitCard1 = Card.Suits.valueOf(card1.getSuit());
        Card.Suits suitCard2 = Card.Suits.valueOf(card2.getSuit());

        // henter værdiern af ENUM, via ordinal(), og sammenligner dem.
        if (suitCard1.ordinal() < suitCard2.ordinal()) {
            return card2;
        } else {
            return card1;
        }
    }

}
