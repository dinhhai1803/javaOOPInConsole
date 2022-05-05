import java.util.Scanner;

public class inputter {
    private static Scanner scanner = new Scanner(System.in);
    public static String inputStr(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    public static int inputInt(String msg){
        int number = 0;
        while(true){
            try {
                System.out.println(msg);
                number =Integer.parseInt(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    public static double inputDouble(String msg){
        double number = 0;
        while(true){
            try {
                System.out.println(msg);
                number =Double.parseDouble(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
