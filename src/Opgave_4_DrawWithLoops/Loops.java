package Opgave_4_DrawWithLoops;

public class Loops {
    public void drawLeftTriangle(int numberOfRows) {
        String stars = " * ";
        for (int i = 0; i < numberOfRows; i++) {
            String starSign = String.format("%-30s", stars); // minus alligner stjerner til modsatte side (L).
            System.out.println(starSign);
            stars += " * "; // stars = stars + " * ";
        }
    }

    public void drawRightTriangle(int numberOfRows) {
        String stars = " * ";
        for (int i = 0; i < numberOfRows; i++) {
            String starSign = String.format("%30s", stars); //giver 30 pladser, af strings eller til strings. positiv tal (R).
            System.out.println(starSign);
            stars += " * ";
        }
    }

    public void drawSquare(int a) {
        StringBuilder str = new StringBuilder();
        String star = " * ";
        str.append(star.repeat(a)); // gentager samme karakter "a" antal gange.

        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }
}
