import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inputter {
    private String engUrl = "eng.txt";
    private String vieUrl = "vie.txt";
    private ArrayList<Language> eLanguages = new ArrayList<>();
    private ArrayList<Language> vLanguages = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Inputter(){

    }

    public Language filter(String info){
        // String[] b = info.split("\\s[=]\\s");
        // b = info.split("\\s+");
        String[] b = new String[2];
        b = info.split("=");
        return new Language(b[0], b[1]);
    }

    public void readFile(String url, ArrayList<Language> lList) throws IOException{
        File newFile = new File(url);
        String line;
        
        if(!newFile.exists()){
            System.out.println("File does not exists");
            newFile.createNewFile();
        }

        FileReader r = new FileReader(newFile);
        BufferedReader reader = new BufferedReader(r);
        while((line = reader.readLine()) !=null){
            lList.add(filter(line));
        }
        reader.close();
    }

    public String findErr(String type, ArrayList<Language> l){
        for(Language i : l){
            if(i.getErrType().equals(type)){
                return i.getErrShow();
            }
        }
        return null;
    }

    public String inpAccountNumber(String language){
        ArrayList<Language> lList = new ArrayList<>();
        String number;
        Pattern pt = Pattern.compile("\\d{10}");
        Matcher m;

        if(language.equals("VietNamese")) {
            lList = this.vLanguages;
            try{
                readFile(vieUrl, this.vLanguages);
            }
            catch(Exception e){
                //System.out.println("Error: " + e);
            }
        }
        if(language.equals("English")) {
            lList = this.eLanguages;
            try{
                readFile(engUrl, this.eLanguages);
            }
            catch(Exception e){
                System.out.println("Error: " + e);
            }
        }
        while (true){
            System.out.println(findErr("enterAccountNumber", lList) + " ");
            number = scanner.nextLine();
            m = pt.matcher(number);
            if(number.length() == 0){
                System.out.println(findErr("errCheckInputIntLimit", lList));
            }
            else{
                if(m.matches()){
                    return number;
                }
                else{
                    System.out.println(findErr("errCheckInputAccount", lList));
                }
            }
        }
    }

    public boolean checkLengthOfPass(String pass){
        if(pass.length() >=8 && pass.length() <= 31)
            return true;
        return false;
    }



    public boolean checkPassContainChar(String pass){
        String[] validChar = {
            "a", "A", "b", "B", "c", "C", "d", "D", "e", "E", "f", "F", "g", "G", 
            "h", "H", "i", "I", "j", "J", "k", "K", "l", "L", "m", "M", "o", "O", 
            "p", "P", "q", "Q", "r", "R", "t", "T", "u", "U", "v", "V", "w", "W", 
            "x", "X", "y", "Y", "z", "Z"
        };
        for(String i : validChar){
            if(pass.contains(i))
                return true;
        }
        return false;
    }

    public String inpPassword(String language){
        ArrayList<Language> lList = new ArrayList<>();
        String pass;
        
        if(language == "VietNamese") lList = this.vLanguages;
        if(language == "English") lList = this.eLanguages;
        while (true){
            System.out.println(findErr("enterPassword", lList) );
            pass = scanner.nextLine();
            boolean check1 = checkLengthOfPass(pass);
            boolean check2 = checkPassContainChar(pass);
            if(pass.length() == 0){
                System.out.println(findErr("errCheckInputIntLimit", lList));
            }
            else{
                if(check1 && check2)
                    return pass;
                else{
                    if(!check1 && check2)
                        System.out.println(findErr("errCheckLengthPassword", lList));   
                    else{
                        if(check1 && !check2)
                            System.out.println(findErr("errCheckAlphanumericPassword", lList));
                        else
                            System.out.println((findErr("errCheckLengthPassword", lList)) + (findErr("errCheckAlphanumericPassword", lList)));
                    }
                }
            }
        }
    }

    public char changeToChar(int i){
        return (char)i;
    }

    // public String createRandCaptcha(){
    //     Random random = new Random();
    //     int min = 48;
    //     int max = 90;
    //     int[] numbers = new int[5];
    //     char[] numbersInChar = new char[5];
    //     String captcha = "";

    //     for(int i=0; i<numbers.length; i++){
    //         numbers[i] = random.nextInt(max - min) + min;
    //         numbersInChar[i] = changeToChar(numbers[i]);
    //         captcha += numbersInChar[i];
    //     }
    //     return captcha;
    // }

    public String createRandCaptcha(){
        Random random = new Random();
        int min1 = 48;
        int max1 = 57;
        int min2 = 65;
        int max2 = 90;
        int[] numbers = new int[5];
        char[] numbersInChar = new char[5];
        String captcha = "";

        for(int i=0; i<numbers.length; i++){
            int rand = random.nextInt(2) + 1;
            if(rand == 1){
                numbers[i] = random.nextInt(max1 - min1) + min1;
                numbersInChar[i] = changeToChar(numbers[i]);
                captcha += numbersInChar[i];
            }
            else {
                numbers[i] = random.nextInt(max2 - min2) + min2;
                numbersInChar[i] = changeToChar(numbers[i]);
                captcha += numbersInChar[i];
            }
        }
        return captcha;
    }

    public boolean checkMatchCaptcha(String randCap, String inpCap){
        for(char i=0; i< randCap.length(); i++){
            if(randCap.contains(inpCap))
                return true;
        }
        return false;
    }

    public void inpCaptcha(String language){
        ArrayList<Language> lList = new ArrayList<>();
        String randCaptcha = createRandCaptcha();
        String cap;
        
        if(language == "VietNamese") lList = this.vLanguages;
        if(language == "English") lList = this.eLanguages;

        System.out.println(findErr("captcha", lList) + " " + randCaptcha);
        while(true){
            System.out.println(findErr("enterCaptcha", lList));
            cap = scanner.nextLine();
            if(cap.length() == 0){
                System.out.println(findErr("errCheckInputIntLimit", lList));
            }
            else{
                if(checkMatchCaptcha(randCaptcha, cap)){
                    findErr("loginSuccess", lList);
                    break;
                }
                else{
                    System.out.println(findErr("errCaptchaIncorrect", lList));
                }
            }
        }
    }

    public void logginSuccess(String language){
        ArrayList<Language> lList = new ArrayList<>();
        String randCaptcha = createRandCaptcha();
        
        if(language == "VietNamese") lList = this.vLanguages;
        if(language == "English") lList = this.eLanguages;

        System.out.println(findErr("loginSuccess", lList).toUpperCase());

    }


    // public static void main(String[] args) {
    //     Inputter i = new Inputter();
    //     System.out.println(i.createRandCaptcha());
    // }


}
