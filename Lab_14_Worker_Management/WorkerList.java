import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

public class WorkerList extends Worker {

    private ArrayList<Worker> wList;
    private Hashtable<Worker, Adjust> aTable;

    public WorkerList(){
        this.wList = new ArrayList<>();
        aTable = new Hashtable<>();
    }

    public ArrayList<Worker> getwList() {
        return wList;
    }

    public void setwList(ArrayList<Worker> wList) {
        this.wList = wList;
    }

    public void addWorker(){
        int id;
        String name;
        int age;
        int salary;
        String location;

        id = Inputter.inputNormalInt("Enter Code of Worker: ");
        name = Inputter.inputStr("Enter Name of Worker: ");
        age = Inputter.inputIntInRange("Enter Age of worker: ", 18, 50);
        salary = Inputter.inputIntFrom("Enter Salary of Worker: ", 0);
        location = Inputter.inputStr("Enter Work location of Worker: ");

        this.wList.add(new Worker(id, name, age, salary, location));
        System.out.println("Add Successfully!");
    }

    public void displayWorker(){
        System.out.println("-------------------- Display Information Salary --------------------");
        System.out.println("Code" +"\t" + " Name" +"\t" + " Age" +"\t" + " Salary" +"\t" + " Status" +"\t" + " Date" +"\t" );
        for(Worker i : this.aTable.keySet()){
            System.out.print(i);
            System.out.println(this.aTable.get(i));
        }
        System.out.println();
    }

    public Worker search(int id){
        for(Worker i : this.wList){
            if(i.getId() == id)
                return i;
        }
        return null;
    }

    public void adj(int id, int amount, String status, String date ){
        Worker w = search(id);

        if(status == "UP"){
            w.setSalary(w.getSalary() + amount);
            this.aTable.put(w, new Adjust(status, date));
        }
        if(status == "DOWN"){
            w.setSalary(w.getSalary() - amount);
            this.aTable.put(w, new Adjust(status, date));
        }

    }

    public String getDate(){
        String d, m, y;
        d = Inputter.inputStr("Enter day adjust: ");
        m = Inputter.inputStr("Enter month adjust: ");
        y = Inputter.inputStr("Enter year adjust: ");
        return d + "/" + m + "/" + y;
    }
    

    public void changeSalary(String status){
        int id, amount;
        String date;
        boolean flag = true;
        System.out.println("-------- " + status + " Salary --------");

        id = Inputter.inputNormalInt("Enter the ID of worker you want to adjust: ");
        while(flag){
            if(search(id) == null){
                System.out.println("This ID does not exist");
                id = Inputter.inputNormalInt("Try again: ");
            }
            else
                break;
        }
        amount = Inputter.inputIntFrom("Enter amount of money: ", 0);
        System.out.println("Adjusted!");
        date = getDate();

        adj(id, amount, status, date);
        

    }
}
