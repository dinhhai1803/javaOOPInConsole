package JavaLab.Lab_1;

import java.util.Scanner;

public class Inputter {

    public static int inputInt(String mgs){       
            Scanner scannerInt = new Scanner(System.in) ;
            System.out.println(mgs);
            return scannerInt.nextInt();
            
    }

    public static String inputStr(String mgs){ 
            Scanner scannerStr = new Scanner(System.in);
            System.out.println(mgs);
            return scannerStr.nextLine();
    }

    public static char inputChar(String mgs){ 
            Scanner scannerChar = new Scanner(System.in);
            System.out.println(mgs);
            return scannerChar.nextLine().toUpperCase().charAt(0);
    }

    public static String inputCourse(String mgs){ 
        String sem = "";
        Scanner scannerSem = new Scanner(System.in);
        boolean flag = true;
        while(flag){
                System.out.println(mgs);
                sem = scannerSem.nextLine().toUpperCase();
                if(sem.equals("JAVA") || sem.equals(".NET") || sem.equals("C") || sem.equals("C++")){
                        flag = false;
                        return sem;
                }
                else{
                        System.out.println("There are only three courses: Java, .Net, C/C++). Try again!");
                }
        }
        return sem;
    }
 }
