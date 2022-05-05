package data;

import validate.Validation;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends ArrayList<String> {
    public Menu(){
        super();
    }

    public int getChoice(){
        System.out.println("========WELCOME TO BOOK MANAGEMENT=======");
        int ret = 0;
        if(this.size() > 0){
            for (int i = 0; i < this.size(); i++){
                System.out.println(this.get(i));
            }
            ret = Validation.getInt("Your choice: ", "Ivalid! Please input from 1 to "+ this.size(),0,this.size());
        }
        return ret;
    }
    public static final Scanner sc = new Scanner(System.in);
}
