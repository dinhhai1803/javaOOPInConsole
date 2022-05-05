import java.util.ArrayList;

public class Menu {
    private ArrayList<String> menu;

    public Menu(String[] menuStr){
        this.menu = new ArrayList<>();
        addMenu(menuStr);
    }

    public ArrayList<String> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<String> menu) {
        this.menu = menu;
    }

    public void addMenu(String[] mn){
        for(String i : mn){
            this.menu.add(i);
        }
    
    }

    public void displayMenu(){
        System.out.println("======== Worker Mamagement ========");
        for(String i : this.menu){
            System.out.println("\t" + (menu.indexOf(i) + 1) + ". " + i);
        }
    }

    public int getChoice(String msg, int numberOfChoice){
        return Inputter.inputIntInRange(msg, 1, numberOfChoice);
    }

}
