package twoKindsOfPlayers_5;


import java.util.Random;

public class ComputerPlayer implements Player{
    @Override
    public int makeAGuess(int maxValueComputer) {
        Random random = new Random();
        int max = maxValueComputer, min = 1;
        return random.nextInt(max - min + 1)+ min;
    }
}
