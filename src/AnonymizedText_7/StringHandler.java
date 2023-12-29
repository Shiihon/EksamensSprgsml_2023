package AnonymizedText_7;

import java.util.List;

public class StringHandler {

    public String replaceText(String string, List<String> studentNames) {
        String placeHolder = string;

        for (String nameInList : studentNames) {
            placeHolder = placeHolder.replace(nameInList, "Den studerende");
        }
        return placeHolder;
    }

    public String replaceSex (String string, List<String> sex){
        for(String typeOfSex : sex){
            string = string.replace(typeOfSex, "Vedkommende");
        }
        return string;
    }
}
