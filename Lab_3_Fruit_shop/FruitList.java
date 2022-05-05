package JavaLab.Lab_3_Fruit_shop;

import java.util.ArrayList;
// import java.util.HashMap;
import java.util.Hashtable;


public class FruitList extends Fruit{
    private ArrayList<Fruit> fruits;
    Hashtable<String, ArrayList<Buyer>> buyerList;
    
    public FruitList(){
        fruits = new ArrayList<>();
        buyerList = new Hashtable<>();
    }

    public void create(String mgs){
        boolean flag = true;
        int fruitID;
        String fruitName;
        int price;
        int quanlity;
        String origin;

        do{
            System.out.println(mgs.toUpperCase());

            fruitID = Inputter.inputInt("Enter the id of fruit: ");
            fruitName = Inputter.inputStr("Enter the name of fruit: ");
            price = Inputter.inputInt("Enter the price of fruit: ");
            quanlity = Inputter.inputInt("Enter the quanlity of fruit: ");
            origin = Inputter.inputStr("Enter the origin of fruit: ");
    
            fruits.add(new Fruit(fruitID, fruitName, price, quanlity, origin));
            flag = Inputter.check("Do you want to continues (Y/N): ");
        }while(flag);

        showFruits();
        System.out.println();

    }

    public void showFruits(){
        System.out.println("List of Fruit: ");
        System.out.println("| ++Item++ | | ++Fruit Name++ | | ++Origin++ | | ++Price++ | ");
        for(Fruit i : fruits){
            System.out.println(i);
        }
        System.out.println();
    }

    public Fruit search(int id){
        for(Fruit i : fruits){
            if(i.getFruitID() == id) return i;
        }
        return null;
    }

    // public int count(Fruit i, int amount){
    //     return i.getPrice() * amount;
    // }

    public void buy(){
        boolean flag = true;
        int amount =0;
        Fruit check;
        int choice;
        String name;
        ArrayList<Buyer> lb = new ArrayList<>();

        do{
            showFruits();
            choice = Inputter.inputInt("Enter the ID of fruit you want to buy: ");
            check = search(choice);
            if(check == null) System.out.println("Invalid ID !!!");
            else{
                System.out.println("You selected: " + check.getFruitName());
                amount = Inputter.inputInt("Input quanlity of fruit: ");
                check.setQuanlity(this.getQuanlity() - amount);
            }
            flag = Inputter.check("Do you want to order now?");
        }
        while(!flag);

        name = Inputter.inputStr("Input your name: ");

        if(chechDuplicatedName(name)==null){
            lb.add(new Buyer(check.getFruitName(), amount, check.getPrice(), amount *  check.getPrice()));
        }
        else{
            buyerList.get(name).add(new Buyer(check.getFruitName(), amount, check.getPrice(), amount *  check.getPrice()));
        }

        buyerList.put(name, lb);
        System.out.println("Product | Quantity | Price | Amount");
        System.out.println(check.getFruitName() + "\t" + amount + "\t" + check.getPrice() + "\t" + amount *  check.getPrice());
        System.out.println("Total: " + amount *  check.getPrice() + "$");
        System.out.println();
    }

    public String chechDuplicatedName(String name){
        for(String i : buyerList.keySet()){
            if (i.equals(name)) return i;
        }
        return null;
    }

    public void viewOrder(){
        if (buyerList == null){
            System.out.println("No one has ordered produce");
        }
        else{
            for(String i : buyerList.keySet()){
                System.out.println("Customer: ".toUpperCase() + i);

                if(buyerList.get(i).size() > 1){
                    System.out.println("Produce | Quanlity | Price | Amount");
                    for(Buyer j : buyerList.get(i)){
                        System.out.println(j.toString());
                    }
                }
                else{
                    System.out.println("Produce | Quanlity | Price | Amount");
                    System.out.println(buyerList.get(i).toString());
                }   
            }
        }

    }

}
