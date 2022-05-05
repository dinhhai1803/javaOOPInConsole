package JavaLab.Lab_1;

public class StudentManager extends Menu{
    StudentList studentList = new StudentList();
    public static StudentManager stm = new StudentManager();
    public StudentManager(){
    }

    String[] menuOptions = {"Create a new student", "Find and Sort student by name", "Delete student by name", "Update information of a student by name", "Report", "Exist"};

    public void run(String msg){
        int choice;
        boolean flag = studentList.causetion();
        do{
            System.out.println(msg);
            // super.showMenu();
            // choice = super.getChoice();
            stm.showMenu();
            choice = stm.getChoice();

            switch(choice){
                case 1: create();
                break;
                case 2: sort();find();
                break;
                case 3: Delete();
                break;
                case 4: Update();
                break;
                case 5: Report();
                break;
                case 6: exit();
                break;
                default: System.out.println("Invalid choice!");
            }
        }
        while(choice > 0 && choice <=6 && flag == true);

    }

    public void create(){
        studentList.createStudent();
    }

    public void sort(){
        studentList.sort();
    }

    public void find(){
        String name = Inputter.inputStr("Enter the name you want to find: ");
        studentList.find(name);
    }

    public void Delete(){
        studentList.delete(Inputter.inputStr("Enter the name of student you want to delete: "));
    }

    public void Update(){
        studentList.update(Inputter.inputInt("Enter the ID of student you want to update: "));
    }

    public void Report(){
        studentList.showAll();
    }

    public void exit(){
        System.out.println("Good bye!!!");
    }

    public void add(){
        super.add(menuOptions);
    }

    public void showMenu(){
        for(int i=0; i<menuOptions.length; i++){
            System.out.println((i+1)+" : "+menuOptions[i]);
        }
    }

    public int getoption(){
        return Inputter.inputInt("Your choice: ");
    }

    public static void main(String[] args) {
    
        stm.add();
        stm.run("WELCOME TO STUDENT MANAGEMENT");
    }
}
