package AnonymizedText_7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringHandler stringHandler = new StringHandler();
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Katrine");
        studentNames.add("Anders");
        studentNames.add("Joakim");
        studentNames.add("Stine");

        System.out.println(stringHandler.replaceText("Katrine trak sit spørgsmål kl 10. Katrine fik karakteren 7. Anders trak sit spørgsmål kl 11. Anders fik karakteren 4.", studentNames));

        List<String> typesOfSex = new ArrayList<>();
        typesOfSex.add("Han");
        typesOfSex.add("Hun");
        typesOfSex.add("han");
        typesOfSex.add("hun");

        System.out.println(stringHandler.replaceSex("Han fik karakteren 12. hun fik karakteren 7", typesOfSex));


    }
}
