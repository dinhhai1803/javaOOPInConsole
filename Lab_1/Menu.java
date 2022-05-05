package JavaLab.Lab_1;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> menu = new ArrayList<>();

    public Menu(){
    }

    public void add(String[] menuList){
        for(int i=0; i<menu.size(); i++){
            menu.add(i, menuList[i]);
        }
    }

    public void showMenu(){
        for(int i=0; i<menu.size(); i++){
            System.out.println((i+1)+ " : "+menu.get(i));
        }
    }

    public int getChoice(){
        return Inputter.inputInt("Your choice: ");
    }

    

}
