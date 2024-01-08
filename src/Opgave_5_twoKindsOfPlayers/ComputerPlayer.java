package Opgave_5_twoKindsOfPlayers;


import java.util.Random;

public class ComputerPlayer implements Player{
    @Override
    public int makeAGuess(int maxValueComputer) {
        Random random = new Random();
        int max = maxValueComputer, min = 1;
        return random.nextInt(max - min + 1)+ min;

        // mere fleksibel hvis man vil have forskellige ranges (overEngineered)
        // max - min + 1 --> sørger for at vi har det korrekte range imellem vores tal. (som der kan vælges fra).
    }
}
