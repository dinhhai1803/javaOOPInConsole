
public class ExpenseManagement {
    private String[] menu = {
        "Add an expense",
        "Display all expenses",
        "Delete an expense",
        "Quit"
    };
    private Menu m;
    private ExpensesList eList;

    public ExpenseManagement(){
        m = new Menu(menu, "Handy Expense Program");
        eList = new ExpensesList();
    }

    public void run(){
        int choice = 0;

        do{
            this.m.showMenu();
            choice = this.m.getChoice();
            switch(choice){
                case 1:{
                    this.eList.addExpense();
                }
                break;
                case 2:{
                    this.eList.displayAll();
                }
                break;
                case 3:{
                    this.eList.deleteExpense();
                }
                break;
                case 4:{
                    System.out.println("Good bye");
                }
                break;
            }

        }
        while(choice > 0 && choice <4);
    }

    public static void main(String[] args) {
        ExpenseManagement eManagement = new ExpenseManagement();
        eManagement.run();
    }
}
