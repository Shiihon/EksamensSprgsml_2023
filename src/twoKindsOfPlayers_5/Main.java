package twoKindsOfPlayers_5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomInMain = new Random();
        int max = 10, min = 1;
        int randomNumber = randomInMain.nextInt(max - min + 1) + min;

        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();

        int humanPlayerGuess = humanPlayer.makeAGuess(max);
        int computerPlayerGuess = computerPlayer.makeAGuess(max);

        if (humanPlayerGuess == randomNumber) {
            System.out.println("you have guessed correct!");
        } else if (computerPlayerGuess == randomNumber) {
            System.out.println("Sorry! The computer won this time!");
        } else {
            System.out.println("None of you guessed correct! Better luck next time!");
        }

    }
}
