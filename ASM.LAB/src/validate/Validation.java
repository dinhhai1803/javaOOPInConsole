package validate;

import java.util.Scanner;

public class Validation {
    private static final Scanner sc = new Scanner(System.in);

    public static String getId(String msg, String noDataMsg, String invalidFormat, String format){
        boolean check;
        while (true){
            System.out.println(msg);
            String id = sc.nextLine().toUpperCase().trim();
            check = id.matches(format);
            if (id.length() == 0 || id.isEmpty()) {
                System.out.println(noDataMsg);
            }
            else if (check == false){
                System.out.println(invalidFormat);
            }
            else return id;
        }
    }

    public static String getOption(String inputMsg, String errMsg) {
        while (true) {
            System.out.print(inputMsg);
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("N")) {
                return option;
            } else {
                System.out.println(errMsg);
            }
        }
    }

    public  static int getInt(String msg, String errMsg, int lb, int ub){
        while (true){
            try{
                System.out.println(msg);
                int n = Integer.parseInt(sc.nextLine());
                if (lb > n || ub < n){
                    throw new Exception();
                }
                return n;
            } catch (Exception e){
                System.out.println(errMsg);
            }
        }
    }

    public  static String getString(String msg, String errMsg){
        while (true){
            System.out.println(msg);
            String s = sc.nextLine().trim().toUpperCase();
            if (s.length() == 0 || s.isEmpty()){
                System.out.println(errMsg);
            }
            else return s;
        }
    }

    public static String getGenre(String msg, String noDataMsg, String invalidFormat, String format){
        boolean check;
        while (true){
            System.out.println(msg);
            String genre = sc.nextLine().toUpperCase().trim();
            check = genre.matches(format);
            if (genre.length() == 0 || genre.isEmpty()) {
                System.out.println(noDataMsg);
            }
            else if (check == false){
                System.out.println(invalidFormat);
            }
            else return genre;
        }
    }

    public static String getIsbn(String msg, String noDataMsg, String invalidFormat, String format){
        boolean check;
        while (true){
            System.out.println(msg);
            String isbn = sc.nextLine().toUpperCase().trim();
            check = isbn.matches(format);
            if (isbn.length() == 0 || isbn.isEmpty()) {
                System.out.println(noDataMsg);
            }
            else if (check == false){
                System.out.println(invalidFormat);
            }
            else return isbn;
        }
    }
}
