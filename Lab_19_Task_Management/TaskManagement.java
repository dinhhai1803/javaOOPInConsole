import java.io.File;

public class TaskManagement {
    TaskList tList = new TaskList();
    private String[] menu = {
        "Add Task",
        "Delete Task",
        "Display Task",
        "Exit"
    };

    public void showMenu(){
        int count = 1;
        System.out.println("========= Task Program ==========");
        for(String i : this.menu){
            System.out.println("\t" + count + ". " + i);
            count++;
        }
    }

    public void run(){
        int choice;

        do{
            this.showMenu();
            choice = Inputter.inpIntFromTo("Your choice: ", 1, this.menu.length);
            switch(choice){
                case 1: {
                    this.tList.addTask();
                }
                break;
                case 2: {
                    this.tList.deleteTask();
                }
                break;
                case 3: {
                    this.tList.showAll();
                }
                break;
                case 4: {
                    this.tList.exitProgram();
                }
                break;
            }
        }
        while(choice > 0 && choice <4);
    }

    public int sizOf(String s) {
        return ((s.substring(s.lastIndexOf(" "), s.length()).length()) - 1);
    }

    public static void main(String[] args) {
        TaskManagement taskManagement = new TaskManagement();
        // taskManagement.run();
        System.out.println(taskManagement.sizOf("Welcome to ABC"));
    }
}
