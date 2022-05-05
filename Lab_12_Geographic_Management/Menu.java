import java.util.ArrayList;

public class Menu {
    
    private ArrayList<String> menu;

    public Menu(String[] menuStr){
        menu = new ArrayList<>();
        for(String i : menuStr){
            this.menu.add(i);
        }
    }

    public ArrayList<String> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<String> menu) {
        this.menu = menu;
    }

    public void showMenu(){
        System.out.println("\t\t\tMENU\t\t\t");
        System.out.println("========================================================================");
        for(String i : menu){
            System.out.println("||  " + (menu.indexOf(i) + 1) + ". " + i );
        }
        System.out.println("========================================================================");
    }

    public int getChoice(){
        return Inputter.inputInt("Enter your choice: ");
    }


}
