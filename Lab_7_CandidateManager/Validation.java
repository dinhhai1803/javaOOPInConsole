package JavaLab.Lab_7_CandidateManager;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    static Scanner scanner = new Scanner(System.in);
    static int checkBirthDate(int y){
        while(y < 1900 || y > 2022){
            System.out.println("Birth date is invalid");
            y = scanner.nextInt();
        }
        return y;
    }

    static String checKPhoneNumber(String num){
        while(true){
            try{
                if (Integer.parseInt(num) < 999999999) throw new Exception();    
                return num;
            }
            catch(Exception e){
                System.out.println("Invalid number");   
            }
            num = scanner.nextLine();
        }
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean checkEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    static int checkYearExp(int y){
        while(y < 0 || y > 100){
            System.out.println("Year of experience is invalid");
            y = scanner.nextInt();
        }
        return y;
    }

    static String checkRank(String rank){
        while(true){
            rank = rank.toUpperCase();
            if(rank.equals("EXCELLENCE") || rank.equals("GOOD") ||
            rank.equals("FAIR") || rank.equals("POOR"))
                return rank;
            else{
                System.out.println("Invalid rank of experience");
                rank = scanner.nextLine();
            }
        }
    }
}
