import java.util.ArrayList;

public class Menu {
    private ArrayList<String> menu ;
    private String t;

    public Menu(String[] mn, String t){
        this.t = t;
        menu = new ArrayList<>();
        for(String i : mn){
            this.menu.add(i);
        }
    }

    public void showMenu(){
        int count = 1;
        System.out.println("======== " + this.t + " ========");
        for(String i : this.menu){
            System.out.println(count + ". " + i);
            count++;
        }
    }

    public int getChoice(){
        return inputter.inputInt("Your choice: ");
    }
}
