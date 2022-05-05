package JavaLab.Lab_3_Fruit_shop;

import java.util.Scanner;

public class Inputter {
    static Scanner scanner;
    public static int inputInt(String msg){
        scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextInt();
    }

    public static String inputStr(String msg){
        scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }

    public static boolean check(String msg){
        scanner = new Scanner(System.in);
        System.out.println(msg);
        if(scanner.next().charAt(0) == 'Y'){
            return true;
        }else
            return false;
        
    }
}
