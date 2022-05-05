import java.util.ArrayList;

public class ExpensesList {
    private ArrayList<Expense> eList;

    public ExpensesList(){
        this.eList = new ArrayList<>();
    }

    public static int id = 1;
    public void addExpense(){
        int ID;
        String date, content;
        double number;
        System.out.println("-------- Add an expense --------");
        ID = id++;
        date = inputter.inputStr("Enter Date: ");
        number = inputter.inputDouble("Enter Amount: ");
        content = inputter.inputStr("Enter Content: ");
        this.eList.add(new Expense(ID, date, number, content));
        System.out.println("Add successfully!");
    }

    public double getTotal(){
        double total = 0;
        for(Expense i : this.eList){
            total += i.getNumber();
        }
        return total;
    }

    public void displayAll(){
        System.out.println("--------- Display all expenses --------");
        for(Expense i : this.eList){
            System.out.println(i);
        }
        System.out.println("\t\tTotal: " + getTotal());
    }

    public Expense find(int ID){
        for(Expense i : this.eList){
            if(i.getID() == ID){
                return i;
            }
        }
        return null;
    }
    
    public void deleteExpense(){
        int id;
        System.out.println("-------- Delete an expense --------");
        id = inputter.inputInt("Enter ID: ");
        if(find(id) == null){
            System.out.println("ID not found!");
        }
        else{
            this.eList.remove(find(id));
            System.out.println("Deleted!");
        }
    }
}
