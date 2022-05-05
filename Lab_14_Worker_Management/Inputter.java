import java.util.Scanner;

public class Inputter {
    static Scanner scanner = new Scanner(System.in);

    public static int inputNormalInt(String msg){
        int number = 0;
        System.out.println(msg);
        while(true){
            try {
                System.out.println();
                number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Input must be a number. Try again!");
            }
        }
    }

    public static int inputIntInRange(String msg, int min, int max){
        int number = 0;
        System.out.println(msg);
        while(true){
            try {
                number = Integer.parseInt(scanner.nextLine());
                if(number < min || number > max) throw new Exception();
                return number;
            } catch (Exception e) {
                System.out.println("Input must be a number and in range " + min + " to " + max + ". Try again!");
            }
        }
    }

    public static int inputIntFrom(String msg, int min){
        int number = 0;
        System.out.println(msg);
        while(true){
            try {
                number = Integer.parseInt(scanner.nextLine());
                if(number < min) throw new Exception();
                return number;
            } catch (Exception e) {
                System.out.println("Input must be a number and greater than " + min + ". Try again!");
            }
        }
    }

    public static String inputStr(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    public static char inputChar(String msg){
        System.out.println(msg);
        return scanner.nextLine().toUpperCase().charAt(0);
    }
}
