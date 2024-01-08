package Opgave_4_DrawWithLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Loops loops = new Loops();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose a number between 1-30");

        try {
            int choosenNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("Would you like to make a triangle or a square? T/S");

            String inputChoice = scanner.nextLine();

            if (inputChoice.equalsIgnoreCase("T")) {
                System.out.println("Which side would you like the triangle to be? L/R");

                String choosenSide = scanner.nextLine();

                if (choosenSide.equalsIgnoreCase("L")) {
                    loops.drawLeftTriangle(choosenNumber);
                } else {
                    loops.drawRightTriangle(choosenNumber);
                }
            } else {
                loops.drawSquare(choosenNumber);
            }
        } catch (NumberFormatException n){
            System.out.println("Please try again!");
        }

    }
}
