public class AccountManagement {
    private String[] menu = {
        "VietNamese",
        "English",
        "Exit"
    };
    private Inputter inputter = new Inputter(); 
    private Menu menuObj = new Menu(menu, "Login Program");

    public void run(){
        int choice = 0;

        do{
            this.menuObj.displayMenu();
            choice = this.menuObj.getChoice(1, 3);

            switch(choice){
                case 1: {
                    this.inputter.inpAccountNumber("VietNamese");
                    this.inputter.inpPassword("VietNamese");
                    this.inputter.inpCaptcha("VietNamese");
                    this.inputter.logginSuccess("VietNamese");
                    System.out.println();
                }
                break;
                case 2: {
                    this.inputter.inpAccountNumber("English");
                    this.inputter.inpPassword("English");
                    this.inputter.inpCaptcha("English");
                    this.inputter.logginSuccess("English");
                    System.out.println();
                }
                break;
                case 3: {
                    System.out.println("Good Bye");
                }
                break;

            }

        }
        while(choice>0 && choice<3);
    }

    public static void main(String[] args) {
        AccountManagement aManagement = new AccountManagement();
        aManagement.run();
    }
}
