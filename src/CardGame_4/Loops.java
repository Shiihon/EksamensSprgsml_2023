package CardGame_4;

public class Loops {
    public void drawLeftTriangle(int numberOfRows) {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void drawRightTriangle(int numberOfRows) {
        String stars = " * ";
        for (int i = 0; i < numberOfRows; i++) {
            String starSign = String.format("%30s", stars); //giver 30 pladser, af strings eller til strings.
            System.out.println(starSign);
            stars += " * ";
        }
        System.out.println();
    }
}
