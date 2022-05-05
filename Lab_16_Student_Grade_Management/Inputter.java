import java.util.Scanner;

public class Inputter {
    public static Scanner scanner = new Scanner(System.in);

    public static int inputMin_Max(String msg, int value_min, int value_max){
        int number = 0;
    
        while(true){
            try {
                System.out.println(msg);
                number = Integer.parseInt(scanner.nextLine());
                if(number > value_max){ 
                    System.out.println(msg + " is less than or equal " + value_max);
                    continue;
                }
                if(number < value_min){ 
                    System.out.println(msg + " is gratter than or equal " + value_min);
                    continue;
                }
                return number;

            } 
            catch (Exception e) {
                System.out.println(msg + " is digit");
            }
        }
    }

    public static String inputStr(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    public static char inputChar(String msg){
        System.out.println(msg);
        return scanner.nextLine().charAt(0);
    }

}
