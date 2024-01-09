package Opgave_1_InteractiveQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // QuizElement
        // Quiz
        // main

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

        List<String> wrongAnswersQ3 = new ArrayList<>();

        wrongAnswersQ3.add("English purebred");
        wrongAnswersQ3.add("Danish Warmblood");

        QuizElement q3 = new QuizElement("Which horse is the oldest breed", "Arabian horse", wrongAnswersQ3);
        quiz.addQuizElement(q3);

        List<String> wrongAnswersQ4 = new ArrayList<>();

        wrongAnswersQ4.add("Copenhagen");
        wrongAnswersQ4.add("London");

        QuizElement q4 = new QuizElement("What is the capital of France", "Paris", wrongAnswersQ4);
        quiz.addQuizElement(q4);

        List<String> wrongAnswersQ5 = new ArrayList<>();

        wrongAnswersQ5.add("Black beans");
        wrongAnswersQ5.add("Apples");

        QuizElement q5 = new QuizElement("What is hummus made of", "Chickpeas", wrongAnswersQ5);
        quiz.addQuizElement(q5);

        quiz.playGame();

    }
}
