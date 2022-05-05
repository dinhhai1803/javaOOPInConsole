package JavaLab.Lab_2_Candidate_Management;

import java.util.Scanner;

public class Inputter {
    public static int inputInt(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextInt();
    }

    public static String inputSrt(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }

    public static boolean inputYN(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        if(scanner.nextLine().toUpperCase().charAt(0) == 'Y'){
            return true;
        }
        return false;
    }
}
