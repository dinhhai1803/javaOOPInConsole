package JavaLab.Lab_2_Candidate_Management;

import java.util.ArrayList;

public class IntList extends Intern {
    private ArrayList<Intern> intList;
    public IntList(){
        intList = new ArrayList<>();
    }

    public void create(){
        int ID;
        String FirstName;
        String LastName;
        int DateOfBirth;
        String Address;
        String Phone;
        String Email;
        String Majors;
        int Semester;
        String UniName;

        do{
            ID = Inputter.inputInt("Enter the ID of candidate: ");
            FirstName = Inputter.inputSrt("Enter the first name of candidate: ");
            LastName = Inputter.inputSrt("Enter the last name of candidate: ");
            DateOfBirth = Inputter.inputInt("Enter the date of birth of candidate: ");
            Address = Inputter.inputSrt("Enter the address of candidate: ");
            Phone = Inputter.inputSrt("Enter the phone of candidate: ");
            Email = Inputter.inputSrt("Enter the Email of candidate: ");
            Majors = Inputter.inputSrt("Enter the major of candidate: ");
            Semester = Inputter.inputInt("Enter the semester of candidate: ");
            UniName = Inputter.inputSrt("Enter the university name: ");
    
            intList.add(new Intern(ID, FirstName, LastName, DateOfBirth, Address, Phone, Email, Majors, Semester, UniName));
            if(!Inputter.inputYN("Do you want to continute?"))
                break;
        }
        while(true);


    }

    public int searchFirstName(String firstName){
        for(Intern i : intList){
            if(i.getFirstName().equals(firstName)){
                return intList.indexOf(i);
            } 
        }
        return -1;
    }

    public int searchLastName(String lastName){
        for(Intern i : intList){
            if(i.getLastName().equals(lastName)){
                return intList.indexOf(i);
            } 
        }
        return -1;
    }

    public void find(String firstname, String lastName, int candidateType){
        int index1 = searchFirstName(firstname);
        int index2 = searchLastName(lastName);
        
        if(index1 != -1 && index2 != -1){
            System.out.println("The candidate found");
            System.out.println(expList.get(index1));
            System.out.println(expList.get(index2));
        }
        else{
            if(index1 != -1 && index2 == -1){
                System.out.println(expList.get(index1));
            }
            else if(index1 == -1 && index2 != -1)
                System.out.println(expList.get(index2));
                else 
                    System.out.println("Not found");

        }
                   
    }

    public void showCandidateName(String candidateType){
        System.out.println("==========" + candidateType.toUpperCase() + " CANDIDATE" + "==========");

        for(int i=0; i<intList.size(); i++){
            System.out.println(intList.get(i).FirstName + " " + intList.get(i).LastName);
        }
    }
}
