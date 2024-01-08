package Opgave_3_CardGame;

public class Card {

    public enum Suits {
        clubs, diamonds, hearts, spades;
    }

    public enum Faces {
        Jack, Queen, King, Ace;
    }

    private int rank;
    private Suits suit;

    public Card(int rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suits getSuit() {
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
