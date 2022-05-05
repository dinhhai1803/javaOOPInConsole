import java.util.ArrayList;

public class Menu {
    private ArrayList<String> menu;

    public Menu(String[] menuStr){
        menu = new ArrayList<>();
        for(String i : menuStr){
            menu.add(i);
        }
    }

    public void printMenu(String msg){
        System.out.println(msg);
        for(String i : this.menu){
            System.out.println((menu.indexOf(i) + 1) + ". "+ i);
        }
    }

    public int getChoice(String msg){
        return Validation.input(msg);
    }
}
