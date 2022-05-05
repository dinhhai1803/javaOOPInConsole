import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inputter {
    public static Scanner scanner = new Scanner(System.in);

    public static String inpStr(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }

    public static int inpIntFromTo(String msg, int min, int max){
        int number = 0;
        System.out.println(msg);
        while(true){
            try {
                number = Integer.parseInt(scanner.nextLine());
                if(number < min || number > max) throw new Exception();
                else{
                    return number;
                }
                
            } catch (Exception e) {
                    System.out.println("Input must be a number and" + " grater than " + min + " and smaller than " + max);
                    System.out.println("Try again: ");
            }
        }
    }

    public static int inpNormalInt(String msg){
        int number = 0;
        System.out.println(msg);
        while(true){
            try {
                number = Integer.parseInt(scanner.nextLine());
                return number;
                
            } catch (Exception e) {
                    System.out.println("Input must be a number and" );
                    System.out.println("Try again: ");
            }
        }
    }

    public static float inpFloatFromTo(String msg, float min, float max){
        float number = 0;
        System.out.println(msg);
        while(true){
            try {
                number = Float.parseFloat(scanner.nextLine());
                if(number < min || number > max) throw new Exception();
                else{
                    return number;
                }
                
            } catch (Exception e) {
                    System.out.println("Input must be a number and" + " grater than " + min + " and smaller than " + max);
                    System.out.println("Try again: ");
            }
        }
    }

    public static String inpDate(String msg){
        Pattern pattern = Pattern.compile("([0-9]{2})-([0-9]{2})-([0-9]{4})");
        Matcher matcher;
        String date;
        System.out.println(msg);

        while(true){
            date = scanner.nextLine();
            matcher = pattern.matcher(date);
            if(matcher.find()){
                return date;
            }
            else{
                System.out.println("Date is invalid");
                System.out.println("Try again!");
            }
        }

    }

}
