public class AccountManagement {
    private String[] menu = {
        "Create a new account",
        "Login system",
        "Exit"
    };
    private AccountList aList = new AccountList();

    public AccountManagement(){

    } 

    public void displayMenu(String msg){
        System.out.println(msg);
        int count = 1;
        for(String i : this.menu){
            System.out.println("  " + count + ". " + i);
            count++;
        }
        System.out.println();
    }

    public void run(){
        int choice = 0;

        do{
            displayMenu("======== USER MANAGEMENT SYSTEM ========");
            choice = Inputter.inputInt("Enter your choice: ", 3, 1);
            switch(choice){
            
            case 1:{
                this.aList.createAccount();
            }
            break;
            case 2:{
                this.aList.loginSystem();
            }
            break;
            case 3:{
                // this.aList.displayAllAccount();
                this.aList.exit();
            }
            break;
            }
        }
        while(choice > 0 && choice < 3);
    }

    public static void main(String[] args) {
        AccountManagement accountManagement = new AccountManagement();
        accountManagement.run();
    }
}
