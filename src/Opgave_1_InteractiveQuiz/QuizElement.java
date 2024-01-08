package Opgave_1_InteractiveQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizElement {
    private String question;
    private String correctAnswer;
    private List<String> wrongAnswers;

    public QuizElement(String question, String correctAnswer, List<String> wrongAnswers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.wrongAnswers = wrongAnswers;
    }

    public boolean isCorrect(String answer) {
        if (!answer.equalsIgnoreCase(correctAnswer)) {
            return false;
        }
        return true;
    }

    public String toString() {
        List<String> choices = new ArrayList<>();

        choices.add(correctAnswer);
        choices.addAll(wrongAnswers); // addAll, tilføjer alt fra min liste til den nye liste.
        Collections.shuffle(choices); // shuffler svarmulighederne.

        String listOfChoices = "";
        for (String q : choices) {
            listOfChoices += q + "\n";
        }

        return "\n" + question + "\n\n" + listOfChoices;
    }
}

/*
String listOfChoices = "";
int counter = 1;
        for (String q : choices){
listOfChoices +="["+counter +"] "+q +"\n";
counter++;
        }
 counter til svar mulighederne */