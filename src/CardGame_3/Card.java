package CardGame_3;

public class Card {

    public enum Suits {
        clubs, hearts, spades, diamonds;
    }

    public enum Faces {
        Jack, Queen, King, Ace;
    }

    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        if (getRank() > 0 && getRank() < 10) {
            return String.format("%d of %s", getRank() + 1, getSuit());
        } else {
            Faces face = Faces.values()[getRank() - 10];
            return String.format("%s of %s", face, getSuit());
        }
    }
}
