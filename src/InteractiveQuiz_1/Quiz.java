package InteractiveQuiz_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<QuizElement> quizElements = new ArrayList<>();
    private Scanner scanner;

    public Quiz() {
        scanner = new Scanner(System.in);
    }

    public void askQuestion(QuizElement quizElement) {

        System.out.println(quizElement);
        System.out.print("Your answer : ");

        String input = scanner.nextLine();

        System.out.println("You have answered : " + input);

        if (quizElement.isCorrect(input)) {
            System.out.println("Your guess is correct!");
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
    }
}
