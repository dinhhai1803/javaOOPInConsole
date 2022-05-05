public class BookManagement {
    private BookList bookList;
    private String[] menu = {
        "Add a Book",
        "Find",
        "Update/Delete",
        "Report",
        "Exit"
    };

    public BookManagement(){
        this.bookList = new BookList();
    }

    public void showMenu(String msg){
        int count = 1;
        System.out.println("========" + msg.toUpperCase() + "========");
        for(String i : this.menu){
            System.out.println( "\t" + count + ". " + i);
            count++;
        }
    }

    public void run(){
        int choice = 0;

        do{
            showMenu("Wellcome to Book Management");
            choice = Inputter.inpInt("Your choice: ");
            switch(choice){
                case 1 : {
                    System.out.println("-------- Add a Book --------");
                    this.bookList.addBook();
                    System.out.println();
                }
                break;
                case 2 : {
                    System.out.println("-------- Find --------");
                    this.bookList.findBook();
                    System.out.println();
                }
                break;
                case 3 : {
                    System.out.println("-------- Update/Delete --------");
                    this.bookList.update_Delete();
                    System.out.println();
                }
                break;
                case 4 : {
                    System.out.println("-------- Display all Book --------");
                    this.bookList.report();
                    System.out.println();
                }
                break;
                case 5 : {
                    System.out.println("Good Bye");
                }
                break;
            }
        }
        while(choice > 0 && choice < 5);
    }


    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();
        bookManagement.run();
    }
}
