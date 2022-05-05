import java.util.Scanner;

public class Validation {
    static Scanner scanner = new Scanner(System.in);

    public static int input(String msg){
        int number = 0;
        System.out.println(msg);
        while(true){
            try{
                number = Integer.parseInt(scanner.nextLine());
                return number;
            }
            catch(Exception e){
                System.out.println("Input must be a number. Try again!!!");
            }
        }

    }

    public static int inputNoZero(String msg){
        int number = 0;
        System.out.println(msg);
        while(true){
            try{
                number = Integer.parseInt(scanner.nextLine());
                if(number == 0 ) throw new Exception();
                return number;
            }
            catch(Exception e){
                System.out.println("Input must be a number and none-zero. Try again!!!");
            }
        }

    }
}
