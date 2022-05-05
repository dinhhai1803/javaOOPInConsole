public class Manager {
    private Check check = new Check();
    private String[] menu = {
        "Check Path",
        "Get file name with type Java",
        "Get file with size greater than input",
        "Write more content to file",
        "Read file and count character",
        "Exit"
    };


    public void showMenu() {
        int count = 1;
        System.out.println("======== File Proccessing ========");
        for(String i : menu){
            System.out.println("\t" + count + ". " + i);
            count++;
        }
    }

    public void run(){
        int choice = 0;

        do{
            showMenu();
            choice = Inputter.inpInt("Please choose 1 option: ", "Invalid option!");

            switch(choice) {
                case 1:{
                    System.out.println("--------" + menu[0] + "--------");
                    String path = Inputter.inpString("Enter path: ");
                    int c = check.checkPath(path);
                    if(c == 0) System.out.println("Path does not exist");
                    if(c == 1) System.out.println("Path to file");
                    if(c == 2) System.out.println("Path to directory");
                }
                break;
                case 2:{
                    System.out.println("--------" + menu[1] + "--------");
                    String path = Inputter.inpString("Enter path: ");
                    System.out.println("Result: " + check.listenFileJava(path) + " file(s)");
                }
                break;
                case 3:{
                    System.out.println("--------" + menu[2] + "--------");
                    int size = Inputter.inpInt("Enter size: ", "Size is digit");
                    String path = Inputter.inpString("Enter path: ");
                    System.out.println("Result: " + check.getFileWithGreaterSize(size, path) + " file(s)");
                }
                break;
                case 4:{
                    String content = "";
                    System.out.println("--------" + menu[3] + "--------");
                    content = Inputter.inpString("Enter content: ");
                    String path = Inputter.inpString("Enter path: ");
                    check.writeContentToFile(content, path);
                }
                break;
                case 5:{
                    System.out.println("--------" + menu[4] + "--------");
                    String path = Inputter.inpString("Enter path: ");
                    System.out.println("Total: " + check.readFileAndCountChar(path));
                }
                break;
                case 6:{
                    System.out.println("Good Bye");
                }
                break;

            }
        }
        while (choice > 0 && choice < 6);
    } 

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.run();
    }
}
