import java.util.Scanner;

public class Inputter {
    static Scanner scanner = new Scanner(System.in);

    public static String inputStr(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    public static int inputInt(String msg){
        System.out.println(msg);
        return scanner.nextInt();
    }

    public static int inputChar(String msg){
        System.out.println(msg);
        return scanner.nextLine().toUpperCase().charAt(0);
    }

    public static float inputFloat(String msg){
        System.out.println(msg);
        float number = 0;
        while(true){
            try{
                number = Float.parseFloat(scanner.nextLine());
                if(number <= 0)
                    throw new Exception();
                return number;
            }
            catch(Exception e){
                System.out.println("Input a real number. Try again!!!");
            }
        }
    }
}
