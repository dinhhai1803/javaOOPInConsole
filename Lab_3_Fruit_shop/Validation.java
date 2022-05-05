package JavaLab.Lab_3_Fruit_shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    

        private static final Scanner in = new Scanner(System.in);
    
        //check user input number limit
        public static int checkInputIntLimit(int min, int max) {
            //loop until user input correct
            while (true) {
                try {
                    int result = Integer.parseInt(in.nextLine().trim());
                    if (result < min || result > max) {
                        throw new NumberFormatException();
    
                    }
                    return result;
                } catch (NumberFormatException e) {
                    System.err.println("Please input number in rage [" + min + ", " + max + "]");
                    System.out.print("Enter again: ");
                }
            }
        }
    
        //check user input string
        public static String checkInputString() {
            //loop until user input correct
            while (true) {
                String result = in.nextLine().trim();
                if (result.isEmpty()) {
                    System.err.println("Not empty");
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            }
        }
    
        //check user input int
        public static int checkInputInt() {
            //loop until user input correct
            while (true) {
                try {
                    int result = Integer.parseInt(in.nextLine().trim());
                    return result;
                } catch (NumberFormatException e) {
                    System.err.println("Must be input integer.");
                    System.out.print("Enter again: ");
                }
            }
        }
    
        //check user input double
        public static double checkInputDouble() {
            //loop until user input correct
            while (true) {
                try {
                    double result = Double.parseDouble(in.nextLine());
                    return result;
                } catch (NumberFormatException e) {
                    System.err.println("Must be input double");
                    System.out.print("Enter again: ");
                }
    
            }
        }
    
        //check user input yes/ no
        public static boolean checkInputYN() {
            System.out.print("Do you want to continue (Y/N)? ");
            //loop until user input correct
            while (true) {
                String result = checkInputString();
                //return true if user input y/Y
                if (result.equalsIgnoreCase("Y")) {
                    return true;
                }
                //return false if user input n/N
                if (result.equalsIgnoreCase("N")) {
                    return false;
                }
                System.err.println("Please input y/Y or n/N.");
                System.out.print("Enter again: ");
            }
        }
    
        //check id exist
        public static boolean checkIdExist(ArrayList<Fruit> lf, int id) {
            for (Fruit fruit : lf) {
                if (id == fruit.getFruitID()) {
                    return false;
                }
            }
            return true;
        }
    
        //check item exist or not
        public static boolean checkItemExist(ArrayList<Buyer> lo, String name) {
            for (Buyer order : lo) {
                if (order.getBName().equalsIgnoreCase(name)) {
                    return false;
                }
            }
            return true;
        }
    }

