package JavaLab.Lab_1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList extends Student {
    private ArrayList<Student> StList;

    public StudentList(){
        StList = new ArrayList<>();
    }

    public void addStudent(int ID, String name, int Sem, String course){
        StList.add(new Student(ID, name, Sem, course));
    }

    int count = 0;
    public void createStudent(){

        while(true){
            count ++;
            int id = Inputter.inputInt("Enter the ID of student: ");
            String name = Inputter.inputStr("Enter the name of student: ");
            int sem = Inputter.inputInt("Enter the semester of student: ");
            String course = Inputter.inputCourse("Enter the course of student: ");
            System.out.println();
            int flag = checkDuplicated(id, name);
            if(flag == -1){
                name = Inputter.inputStr("This name has been existed. Enter Name again: ");
            }else{
                if(flag == -2){
                    id = Inputter.inputInt("This ID has been existed. Enter ID again: ");
                }
            }
            addStudent(id, name, sem, course);
            
            if(count >= 3){
                char test = Inputter.inputChar("Do you want to continue (Y/N)?");
                if(test != 'Y')
                    break;
            }
           
        }

    }

    public boolean causetion(){
        boolean flag = true;
        if (StList.size() < 10){
            return true;
        }else{
            System.out.println();
            if (Inputter.inputStr("Do you want to add more(Y/N)? ").CASE_INSENSITIVE_ORDER.equals("Y")){
                flag = true;
            }
            else
                flag = false;
        }
        return flag;
    }

    public int search(String name){
        for(int i=0; i<StList.size(); i++){
            if(StList.get(i).getName().equals(name)) return i;
        }
        return -1;
    }

    public int checkDuplicated(int ID, String name){
        int flag = 0;
        if(search(name) != -1 ){
            flag = -1;
        }else {
            if(searchByID(ID) != -1){
            flag = -2; }
            else flag = 0;}
        return flag;
    }

    public void find(String name){
        int index = search(name);
        if ( index == -1){
            System.out.println("Not found!");
        }else{
            System.out.println(StList.get(index));
        }
    }

    public int searchApartOfName(String name){
        for(int i=0; i<StList.size(); i++){
            if(StList.get(i).getName().concat(name).equals(name)) return i;
        }
        return -1;
    }

    public void findApartOfName(String name){
        int index = search(name);
        if ( index == -1){
            System.out.println("Not found!");
        }else{
            System.out.println(StList.get(index));
        }
    }

    public int searchByID(int ID){
        for(int i=0; i<StList.size(); i++){
            if(ID == StList.get(i).getId()) return i;
        }
        return -1;
    }

    public void findByID(int ID){
        int index = searchByID(ID);
        if ( index == -1){
            System.out.println("Not found!");
        }else{
            System.out.println(StList.get(index));
        }
    }

    public void sort(){
        Collections.sort(StList);
    }

    public void delete(String name){
        int index = search(name);
        if (index == -1){
            System.out.println("This student does not exist in the list!");
        }else{
            StList.remove(index);
            System.out.println("Deleted!");
        }
    }

    public void update(int ID){
        int index = searchByID(ID);
        if (index == -1){
            System.out.println("This student does not exist in the list!");
        }else{
            System.out.println("The information of the student: ");
            System.out.println(StList.get(index));
            System.out.println("Enter new information: ");
            StList.get(index).setName(Inputter.inputStr("Enter the name of student: ")); 
            StList.get(index).setSemester(Inputter.inputInt("Enter the semester of student: ")); 
            StList.get(index).setCourse(Inputter.inputCourse("Enter the course of student: ")); 
            System.out.println("Updated!");
        }
    }

    public void showAll(){
        if (StList.isEmpty()){
            System.out.println("There are no student in the list!!!");
        }else
        for(Student i : StList){
            System.out.println(i);
        }
    }
}
