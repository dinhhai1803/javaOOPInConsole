public class WorkerManagement {
    static WorkerList workerList = new WorkerList();
    static void run(){
        String[] menu = {
            "Add a Worker.",
            "Increase salary for worker.",
            "Decrease for worker.",
            "Show adjusted salary worker information.",
            "Exit program"
        };
        int choice = 0;
        Menu mn = new Menu(menu);

        do{
            mn.displayMenu();
            choice = mn.getChoice("Your choice: ", 5);

            switch(choice){
                case 1: {
                    workerList.addWorker();
                }
                break;
                case 2:{
                    workerList.changeSalary("UP");;
                }
                break;
                case 3:{
                    workerList.changeSalary("DOWN");;
                }
                break;
                case 4:{
                    workerList.displayWorker();
                }
                break;
                case 5:{
                    System.out.println("Good Bye");
                }
            }
        }
        while(choice > 0 && choice < 5);
    }

    public static void main(String[] args) {
        run();
    }
}
