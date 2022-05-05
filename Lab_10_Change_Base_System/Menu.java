package JavaLab.Lab_10_Change_Base_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<String> menu;

    public Menu(String[] menuStr){
        menu = new ArrayList<>();
        for(String i : menuStr){
            menu.add(i);
        }
    }

    public void display(){
        for(String i : menu){
            System.out.println(i);
        }
    }

    public int getChoice(){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Input your choice: ");
        return scanner.nextInt();
    }
}
