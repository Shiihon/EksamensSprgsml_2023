package Opgave_3_CardGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Card
        // Deck
        // Game
        // main

        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to play a game? Y/N");

        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Y")) {
            Card playersCard = game.drawCard(); // lav et loop der sammenligner 7 gange.
            System.out.println("You have drawn " + playersCard);



            Card computersCard = game.drawCard();
            System.out.println("The computer has drawn " + computersCard);

           Card highestCard = game.highest(playersCard, computersCard);
           if(highestCard.equals(playersCard)) {
               System.out.println("You have won! With the card: " + playersCard);
           } else {
               System.out.println("The computer has won! With the card: " + computersCard);
           }
        }
    }
}
