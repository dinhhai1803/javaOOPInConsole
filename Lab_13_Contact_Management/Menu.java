import java.util.ArrayList;

public class Menu {
    private ArrayList<String> menu ;

    public Menu(){

    }

    public Menu(String[] menuStr){
        menu = new ArrayList<>();
        for(String i : menuStr){
            menu.add(i);
        }
    }

    public ArrayList<String> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<String> menu) {
        this.menu = menu;
    }

    public void showMenu(){
        System.out.println("======= Contact Program ======");
        for(String i : this.menu){
            System.out.println((this.menu.indexOf(i) + 1) + ". " + i);
        }
    } 

    public void showUnOrderMenu(){
        for(String i : this.menu){
            System.out.println(("*") + " " + i);
        }
    } 

    public int getChoice(){
        return Inputter.inputInt("Your choice:  ");
    }
}
