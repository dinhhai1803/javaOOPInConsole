package JavaLab.Lab_3_Fruit_shop;

public class FruitShop {
    private String[] menu = {"Create Fruit", "View orders", "Shopping(for buyer)", "Exit"};
    private FruitList fruitList = new FruitList();

    public void showMenu(String msg){
        System.out.println(msg);
        for(int i=0; i<menu.length; i++){
            System.out.println("  " + (i+1) + ". " +menu[i]);
        }
    }

    public int getChoice(){
        return Inputter.inputInt("Your choice: ");
    }

    public void run(){
        int choice = 0;
        do{
            showMenu("FRUIT SHOP SYSTEM");
            choice = getChoice();
            switch(choice){
                case 1: create(); break;
                case 2: ViewOrder(); break;
                case 3: Buy(); break;
                case 4: exit(); break;
                default : 
                    System.err.println("Invalid choice !!!");
            }
        }
        while(choice > 0 && choice < 4);
    }

    public void create(){
        fruitList.create("Enter the information of fruit: ");
    }

    public void Buy(){
        fruitList.buy();
    }

    public void ViewOrder(){
        fruitList.viewOrder();
    }

    public void exit(){
        System.out.println("Good Bye");
    } 

    public static void main(String[] args) {
        FruitShop fruitShop = new FruitShop();
        fruitShop.run();
    }
}
