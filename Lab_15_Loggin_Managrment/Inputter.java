import java.util.Scanner;

public class Inputter {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String inputStr(String msg, int numberOfChar){
        String value = "";
        
        while(true){
            System.out.println(msg);
            value = scanner.nextLine();

            if((value.length() < numberOfChar) || checkSpace(value)){
                System.out.println("You must enter at least " + numberOfChar + " charater, and no space!");
            }
            else
                return value;    
        }   
    }

    public static int inputInt(String msg, int max, int min){
        int number = 0;
        while(true){
            try{
                System.out.println(msg);
                number = Integer.parseInt(scanner.nextLine());
            if(number < min || number > max)
                throw new Exception();
            else
                return number;
            }
            catch(Exception e){
                System.out.println("Number must be a integer, greater than " + min + " and smaller than " + max);
            }
        }
    }

    public static boolean checkSpace(String name){
        for(char i : name.toCharArray()){
            if(i == ' ')
                return true;
        }
        return false;
    }
}
