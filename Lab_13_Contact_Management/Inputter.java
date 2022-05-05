import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inputter {
    static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String msg){
        System.out.println(msg);
        int number = 0;
        do{
            try{
                number = Integer.parseInt(scanner.nextLine());
                if(number <= 0) throw new Exception();
                return number;
            }
            catch(Exception e){
                System.out.println("Input must be a positive number!!!. Try again");
            }
        }
        while(true);
    } 

    public static String inputStr(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    public static char inputChar(String msg){
        System.out.println(msg);
        return scanner.nextLine().toUpperCase().charAt(0);
    }

    public static String inputPhoneNumber(String msg){
        System.out.println(msg);
        String number = scanner.nextLine();
        String[] menuStr = {"1234567890",
                            "123-456-7890",
                            "(123)-456-7890",
                            "123.456.7890",
                            "123 456 7890"}; 
        Menu menu = new Menu(menuStr);

        while(true){
            Pattern pattern = Pattern.compile("^(\\d{3}[- .]?){2}\\d{4}$");
            Matcher matcher = pattern.matcher(number);

            if(matcher.matches())
                return number;
            else{
                System.out.println("Please input phone flowing format");
                menu.showUnOrderMenu();
                System.out.println("Try again");
                number = scanner.nextLine();
            }
        }
    }
}
