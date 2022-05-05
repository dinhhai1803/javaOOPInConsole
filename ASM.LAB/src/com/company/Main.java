package com.company;

import data.Manage;
import data.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Manage library = new Manage();
        menu.add("1. Add a book");
        menu.add("2. Find");
        menu.add("3. Update/Delete");
        menu.add("4. Report");
        menu.add("5. Exit");
        int choice;

        do {
            choice = menu.getChoice();
            switch (choice){
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.findBook();
                    break;
                case 3:
                    library.upAndDel();
                    break;
                case 4:
                    library.getInfomationBook();
                    break;
                case 5:
                    System.out.println("See you late!!");
                    break;
            }
        } while (choice != 5);
    }
}
