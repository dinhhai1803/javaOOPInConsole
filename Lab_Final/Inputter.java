import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inputter {
    public static Scanner scanner = new Scanner(System.in);
    
    public static int inpInt(String msg){
        int number = 0;
        while(true){
            try {
                System.out.println(msg);
                number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Input must be a number. Try again");
            }
        }
    }

    public static char inpChar(String msg){
        System.out.println(msg);
        return scanner.nextLine().charAt(0);
    }

    public static String inpString(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    public static boolean checkGenre(String[] list, String genre){
        for(String i : list){
            if(i.equals(genre))
                return true;
        }
        return false;
    }

    public static String inpGener(String msg){
        String[] genreList = {
            "Network",
            "AI",
            "Programming"
        };
        while(true){
            System.out.println(msg);
            String genre = scanner.nextLine();
            boolean c = checkGenre(genreList, genre);
            if(c)
                return genre;
            else {   
                System.out.println("Genre only in : Network, AI, Programming");
            }
        }
    }

    public static String inpISBN(String msg){
        String VALID_ISBN = "\\d{5}-\\d{2}-\\d{2}-\\d{1}|\\d{4}-\\d{1}-\\d{4}-\\d{1}|\\d{3}-\\d{3}-\\d{3}-\\d{1}|\\d{2}-\\d{6}-\\d{1}-\\d{1}|\\d{2}-\\d{3}-\\d{4}-\\d{1}";
        String[] isbnForm = {
            "xxxxx-xx-xx-x",
            "xxxx-x-xxxx-x",
            "xxx-xxx-xxx-x",
            "xx-xxxxxx-x-x",
            "xx-xxx-xxxx-x"
        };
        String in = "";
        while(true){
            System.out.println("Please input ISBN flow: ");
            for(String i : isbnForm){
                System.out.println(i);
            }
            System.out.println(msg);
            in = scanner.nextLine();
            Pattern pattern = Pattern.compile(VALID_ISBN);
            Matcher matcher = pattern.matcher(in);

            if (matcher.find())
                return in;
            else
                System.out.println("ISBN is invalid. Try again");
        }
    }

}
