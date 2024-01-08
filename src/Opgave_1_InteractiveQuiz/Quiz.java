package Opgave_1_InteractiveQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<QuizElement> quizElements = new ArrayList<>();
    private Scanner scanner;
    private int pointCounter;

    public Quiz() {
        scanner = new Scanner(System.in);
        pointCounter = 0;
    }

    public void askQuestion(QuizElement quizElement) {

        System.out.println(quizElement);
        System.out.print("Your answer : ");

        String input = scanner.nextLine();

        System.out.println("You have answered : " + input);

        if (quizElement.isCorrect(input)) {
            System.out.println("Your guess is correct!");
            pointCounter ++;
        } else {
            System.out.println("woops, maybe you'll get it right with the next question!");
        }
    }

    public void addQuizElement(QuizElement quizElement) {
        quizElements.add(quizElement);
    }


    public void playGame() {
        /* for( int i = 0; i < quizElements.size(); i++) {
            askQuestion(quizElements.get(i));
        }*/

        for (QuizElement quizElement : quizElements){
            askQuestion(quizElement);
        }
        System.out.println("You have guessed " + pointCounter + " correct answer(s)! Well done!");
    }
}
