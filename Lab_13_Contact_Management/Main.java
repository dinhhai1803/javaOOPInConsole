public class Main {
    public static void run(){
        ContactList contactList = new ContactList();
        String[] menu = {"Add a Contact",
                        "Display all Contact",
                        "Delete a Contact",
                        "Exit"};
        Menu mn = new Menu(menu);
        int choice = 0;

        do{
            mn.showMenu();
            choice = mn.getChoice();
            switch(choice){
                case 1:{
                    System.out.println("------ Add a Contact ------");
                    contactList.addContact();
                }
                break;
                case 2:{
                    System.out.println("---------------------------------- Display all Contact ------------------------------------");
                    contactList.displayContact();
                }
                break;
                case 3:{
                    System.out.println("------ Delete a Contact ------");
                    contactList.deleteContact();
                }
                break;
                case 4:{
                    contactList.exit();
                }
            }
        }
        while(choice > 0 && choice < 4);
    }
    public static void main(String[] args) {
        run();
    }
}
