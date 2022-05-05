package JavaLab.Lab_4_Normalize_Text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Manager {

    // one space by special character
    public static String formatOneSpaceSpecial(String line, String character){
        StringBuffer stringBuffer = new StringBuffer();
        String[] strings = line.split("\\s*\\" + character + "\\s*");

        for(String oneWord : strings){
            stringBuffer.append(oneWord + " " + character);
            stringBuffer.append(" ");
        }
        return stringBuffer.toString().trim().substring(0, stringBuffer.length() -3);
    }

    // only one space between words and all character lower case
    public static String formatOneSpace(String line){
        line = line.toLowerCase();
        line = line.replaceAll("\\s+", " ");
        line = formatOneSpaceSpecial(line, ".");
        line = formatOneSpaceSpecial(line, ",");
        line = formatOneSpaceSpecial(line, ":");
        line = formatOneSpaceSpecial(line, "\"");
        return line.trim();
    }

    // only one space after comma, dot anf colon
    public static String formatSpecialCharacters(String line){
        StringBuffer stringBuffer = new StringBuffer(line);
        //check before .,:; then delete
        for(int i=0; i< stringBuffer.length() - 1; i++){
            if(stringBuffer.charAt(i) == ' '
                && stringBuffer.charAt(i + 1) == '.'
                || stringBuffer.charAt(i + 1) == ','
                || stringBuffer.charAt(i + 1) == ':'){
                    stringBuffer.deleteCharAt(i);
                }
        }
        return stringBuffer.toString().trim();
    }  

    // first character of word after dot is in Uppercase and other word are in lowercase
    public static String afterDotUpperCase(String line){
        StringBuffer stringBuffer = new StringBuffer(line);
        int lengthLine = stringBuffer.length();

        for(int i=0; i<lengthLine; i++){
            if(stringBuffer.charAt(i) == '.'){
                char afterDot = stringBuffer.charAt(i+2);
                stringBuffer.setCharAt(i+2, Character.toUpperCase(afterDot));
            }
        }
        return stringBuffer.toString().trim();
    }

    // there are no space before and after the word or sentence in quotes("")
    static int countQuotes = 0;
    public static String noSpaceQuotes(String line){
        StringBuffer stringBuffer = new StringBuffer(line);
        
        for(int i=0; i<stringBuffer.length(); i++){
            if(stringBuffer.charAt(i) == '"' && countQuotes % 2 == 0){
                stringBuffer.deleteCharAt(i+1);
                countQuotes++;
            }
            else if(stringBuffer.charAt(i) == '"' && countQuotes % 2 == 1 && i != 0){
                stringBuffer.deleteCharAt(i-1);
                countQuotes++;
            }
        }
        return stringBuffer.toString().trim();
    }

    //  first character of word in first line is in Uppercase
    public static String firstUperCase(String line){
        line = line.substring(3);
        StringBuffer stringBuffer = new StringBuffer(line);
        for(int i=0; i<line.length(); i++){
            if(Character.isLetter(line.charAt(i))){
                stringBuffer.setCharAt(i, Character.toUpperCase(line.charAt(i)));
                break;
            }
        }
        return stringBuffer.toString().trim();
    }

    // must have dot at the end of text
    public static String lastAddDot(String line){
        if(line.endsWith(".")){
            return line;
        }
        else 
            return line + ".";
    }

    // there are no blank line between lines
    public static boolean isLineEmpty(String line){
        if(line.length() == 0)
            return true;
        else    
            return false;
    }
    
    // count line
    public static int countLine(){
        int countLine = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader(new File("D:\\text.txt")));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("D:\\text.txt", true)));
            String line;
            while((line = br.readLine()) != null){
                if(isLineEmpty(line))
                continue;
                countLine++;
            }
            br.close();
            pw.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Can not found");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return countLine;

    }
}
