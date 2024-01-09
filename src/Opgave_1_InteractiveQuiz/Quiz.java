package Opgave_1_InteractiveQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<QuizElement> quizElements = new ArrayList<>(); // indeholder et deck af spørgsmål.
    private Scanner scanner;
    private int pointCounter;

    public Quiz() {
        scanner = new Scanner(System.in);
        pointCounter = 0;
    }

    public void askQuestion(QuizElement quizElement) {

        System.out.println(quizElement); // printer QElementet ud.
        System.out.print("Your answer : "); // fortæller brugeren hvor de kan skrive deres svar.

        String input = scanner.nextLine(); // gemmer brugerens input.

        System.out.println("You have answered : " + input);

        if (quizElement.isCorrect(input)) {
            System.out.println("Your guess is correct!");
            pointCounter++; // tilføjer point til hvert spørgsmål som er korrekt.
        } else {
            System.out.println("woops, maybe you'll get it right with the next question!");
        }
    }

    public void addQuizElement(QuizElement quizElement) {
        quizElements.add(quizElement);
    }


    public void playGame() {
        for (QuizElement quizElement : quizElements) {
            askQuestion(quizElement);
        }
        System.out.println("You have guessed " + pointCounter + " correct answer(s)! Well done!");
    }
}
