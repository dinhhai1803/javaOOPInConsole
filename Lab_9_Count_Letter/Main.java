package JavaLab.Lab_9_Count_Letter;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        CountLetter countLetter = new CountLetter();
        countLetter.inputText();
        HashMap<String, Integer> hm = countLetter.countCharacter(countLetter.getText());
        countLetter.print(hm);
        HashMap<String, Integer> hmOfChar = countLetter.countCharacter(countLetter.changeLetter());
        countLetter.print(hmOfChar);
    }
}
