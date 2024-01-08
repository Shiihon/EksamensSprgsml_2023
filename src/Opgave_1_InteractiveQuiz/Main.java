package Opgave_1_InteractiveQuiz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        List<String> wrongAnswersQ1 = new ArrayList<>();

        wrongAnswersQ1.add("German Shepard");
        wrongAnswersQ1.add("Border Collie");

        QuizElement q1 = new QuizElement("Which dog is commonly used for retrieving?", "Labrador", wrongAnswersQ1);
        quiz.addQuizElement(q1);

        List<String> wrongAnswersQ2 = new ArrayList<>();

        wrongAnswersQ2.add("Black");
        wrongAnswersQ2.add("White");

        QuizElement q2 = new QuizElement("What colour are Oreo cows?", "Black and white", wrongAnswersQ2);
        quiz.addQuizElement(q2);

        quiz.playGame();

    }
}
