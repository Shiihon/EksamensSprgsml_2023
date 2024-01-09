package Opgave_3_CardGame;

public class Card {

    public enum Suits { // Enums - enumerations. en klasse der repræsenterer en gruppe konstante værdier.
        clubs, diamonds, hearts, spades; // er sat så laveste værdi er først og højeste værdi sidst.
    }                                    // godt hvis man har en begrænset mængde mulige værdier (måneder, uger kort kulør)

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
            return String.format("%d of %s", getRank() + 1, getSuit()); // +1 fordi Ace kommer til sidst.
        } else {
            Faces face = Faces.values()[getRank() - 10]; // hvis værdierne er større eller = 10 get rank er fra 10-13, af de specielle kort.
            return String.format("%s of %s", face, getSuit()); // værdierne går fra 0-3, de fås som indexVærdier -> [].
        }
        // faces.values = giver en Array af Enums.
    }
}
