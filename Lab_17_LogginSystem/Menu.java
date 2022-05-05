import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<String> menu;
    private String title;

    public Menu(String[] mn, String t){
        this.menu = new ArrayList<>();
        this.title = t;
        for(String i :mn){
            this.menu.add(i);
        }
    }

    public void displayMenu(){
        int j = 1;
        System.out.println("======== " + this.title.toUpperCase() + " ========");
        for(String i : this.menu){
            System.out.println("\t " + j + ". " + i);
            j++;
        }
        System.out.println();
    }

    public int getChoice(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while(true){
            try {
                System.out.println("Your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                if(choice < min || choice > max) throw new Exception();
                return choice;
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
