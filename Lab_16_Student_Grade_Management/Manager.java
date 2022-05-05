import java.util.ArrayList;

public class Manager {
    String[] menu ={"Add a student", "See information of students", "Exit program"};
    private ArrayList<Student> sList = new ArrayList<>();

    public void displayMenu(){
        int count =1;
        System.out.println("-------- Options -------");
        for(String i : menu ){
            System.out.println(count + ". " + i);
            count++;
        }
    }

    public void run(){
        int choice = 0;
        do{
            displayMenu();
            choice = Inputter.inputMin_Max("Your choice: ", 0, (menu.length + 1));

            switch(choice){
                case 1:{
                    addStudent();
                }
                break;
                case 2:{
                    showAllStudent();
                    classifi();
                }
                break;
                case 3:{
                    System.out.println("Good bye");
                }
                break;
            }
        }
        while(choice > 0 && choice <3);
    }

    public void addStudent(){
        String name, sclass;
        int math, chemistry, physic;
        float avg;
        char type;

        name = Inputter.inputStr("Name: ");
        sclass = Inputter.inputStr("Classes: ");
        math = Inputter.inputMin_Max("Maths", 0, 10);
        chemistry = Inputter.inputMin_Max("Chemistry", 0, 10);
        physic = Inputter.inputMin_Max("Physics", 0, 10);
        avg = average(math, chemistry, physic);
        type = changeType((int) avg);

        this.sList.add(new Student(name, sclass, math, chemistry, physic, avg, type));
    }

    public void showAllStudent(){
        for(Student i : this.sList){
            System.out.println("------ Student " + (this.sList.indexOf(i)+1) + " Information ------");
            System.out.println("Name: " + i.getsName() + "\n" + "Classes: " + i.getsClass() + "\n" + "AVG: " + i.getAvg() + "\n" + "Type: " + i.getType());
        }
    }

    public char changeType(int mark){
        if(mark > 7.5)  return 'A';
        if(mark <= 7.5 && mark >= 6)  return 'B';
        if(mark >= 4 && mark < 6)  return 'C';
        if(mark < 4)  return 'D';
        return 'E';
    }

    public float average(int a, int b, int c){
        return (a + b + c) / 3;
    }

    public int[] count(){
        int[] count = new int[4];
        int countA, countB, countC, countD;
        countA = countB = countC = countD = 0;

        for(Student i : this.sList){
            if(i.getType() == 'A') countA++;
            if(i.getType() == 'B') countB++;
            if(i.getType() == 'C') countC++;
            if(i.getType() == 'D') countD++;
        }

        count[0] = countA; count[1] = countB; count[2] = countC; count[3] = countD;
        return count;
    }

    public float[] countPercen(int[] count, int total){
        float[] percen = new float[4];
        for(int i = 0; i < percen.length; i++){
            percen[i] =  ((float)((float)count[i]/total)) * 100;
        }
        return percen;
    }

    public void print(String msg, float[] percen, int total){
        System.out.println(msg);
        System.out.println("A: " + percen[0] + "%");
        System.out.println("B: " + percen[1] + "%");
        System.out.println("C: " + percen[2] + "%");
        System.out.println("D: " + percen[3] + "%");
    }

    public void classifi(){
        int[] c = count();
        float[] p = countPercen(c, c.length);
        print("-------- Classification --------", p, c.length);
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.run();
    }
}
