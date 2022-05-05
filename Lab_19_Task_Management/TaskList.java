import java.util.ArrayList;


public class TaskList {
    private ArrayList<Task> tList;
    
    public TaskList(){
        this.tList = new ArrayList<>();
    }

    public static int id = 1;
    public void addTask(){
        System.out.println("-------- Add Task --------");
        String require;
        int taskType;
        String date;
        float from, to;
        String assign;
        String reviewer;
        String typeStr = "";

        require = Inputter.inpStr("Requirement Name: ");
        taskType = Inputter.inpIntFromTo("Task Type: ", 1, 4);
        date = Inputter.inpDate("Date: ");
        from = Inputter.inpFloatFromTo("From: ", (float)8, (float)17.5);
        to = Inputter.inpFloatFromTo("From: ", from, (float)17.5);
        assign = Inputter.inpStr("Assignee: ");
        reviewer = Inputter.inpStr("Reviewer: ");

        switch(taskType){
            case 1: {typeStr = "Code";
            break;}
            case 2: {typeStr = "Test";
            break;}
            case 3: {typeStr = "Design";
            break;}
            case 4: {typeStr = "Review";
            break;}
        }
        this.tList.add(new Task(id, typeStr, require, date, from, to, assign, reviewer));
        id++;
        System.out.println("Adding successfully");
        System.out.println();
    }

    public Task search(int id){
        for(Task i : this.tList){
            if(i.getID()==id)
                return i;
        }
        return null;
    }

    public void deleteTask(){
        int id;
        System.out.println("-------- Delete Task --------");
        id = Inputter.inpNormalInt("Input ID of the task you want to delete: ");
        Task findID = search(id); 
        if(findID == null){
            System.out.println("This ID does not exist!");
        }
        else{
            this.tList.remove(findID);
            System.out.println("Deleting successfully!");
            System.out.println();
        }
    }

    public void showAll(){
        System.out.println("---------------- Task ----------------");
        if(this.tList.isEmpty()) System.out.println("The list is empty. Add tasks first");
        else{
            System.out.println("ID\tName\tTask Type\tDate\tTime\tAssidnee\tReviewer");
            for(Task i : this.tList){
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public void exitProgram(){
        System.out.println("Good Bye");
    }
}
