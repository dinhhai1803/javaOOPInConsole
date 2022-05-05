import java.util.Scanner;

public class Inputter {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String inpString(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    public static int inpInt(String msg, String errorMsg) {
        int number = 0;
        while(true) {
            try {
                System.out.println(msg);
                number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

}
