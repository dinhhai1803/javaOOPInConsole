package JavaLab.Lab_9_Count_Letter;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CountLetter {
    
    private String text;

    public CountLetter(String text){
        this.setText(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CountLetter(){

    } 

    public void inputText(){
        Scanner scanner = new Scanner(System.in);
        String text = "";
        while(text == ""){
            System.out.println("Input your text: ");
            text = scanner.nextLine();
            this.setText(text);
        }
    }

    public static void print(HashMap<String, Integer> hm){
        for(String i : hm.keySet()){
            System.out.println(i + " = " + hm.get(i));
        }
    }

    public static  int count(String[] array, String letter){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(letter)){
                count ++;
            }
        }
        return count;
    }

    public HashMap countCharacter(String text){
        HashMap<String, Integer>  map = new HashMap<>(); 
        StringTokenizer st = new StringTokenizer(text, " ");
        String[] array = new String[st.countTokens()];

        int index = 0;
        while(st.hasMoreTokens()){
            array[index] = st.nextToken();
            index++;
        }

        for(int i = 0; i < array.length; i++){
            map.put(array[i], count(array, array[i]));
        }

        return map;
    }

    public String changeLetter(){
        String newString = "";
        for(int i = 0; i < this.text.length(); i++){
            if(this.text.charAt(i) == ' '){
                continue;
            }
            else{
                newString += this.text.charAt(i) + " ";
            }
        }

        return newString;

    }
}
