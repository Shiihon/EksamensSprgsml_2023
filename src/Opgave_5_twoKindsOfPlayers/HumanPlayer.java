package Opgave_5_twoKindsOfPlayers;

import java.util.Scanner;

public class HumanPlayer implements Player{
    Scanner scanner;

    public HumanPlayer(){
        scanner = new Scanner(System.in);
    }
    @Override
    public int makeAGuess(int maxValuePlayer) {
        System.out.println("Please choose a number between 1 and " + maxValuePlayer);

        int playerInput = Integer.parseInt(scanner.nextLine());
        return playerInput;
    }
}
