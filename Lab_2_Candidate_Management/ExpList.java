package JavaLab.Lab_2_Candidate_Management;

import java.util.ArrayList;

public class ExpList extends Experience{
    private ArrayList<Experience> expList;
    
    public ExpList() {
        expList = new ArrayList<>();
    }

    public void create(){
        int ID;
        String FirstName;
        String LastName;
        int DateOfBirth;
        String Address;
        String Phone;
        String Email;

        do{
            ID = Inputter.inputInt("Enter the ID of candidate: ");
            FirstName = Inputter.inputSrt("Enter the first name of candidate: ");
            LastName = Inputter.inputSrt("Enter the last name of candidate: ");
            DateOfBirth = Inputter.inputInt("Enter the date of birth of candidate: ");
            Address = Inputter.inputSrt("Enter the address of candidate: ");
            Phone = Inputter.inputSrt("Enter the phone of candidate: ");
            Email = Inputter.inputSrt("Enter the Email of candidate: ");
            int Explnyear = Inputter.inputInt("Enter the year of expericence: ");
            String ProSkill = Inputter.inputSrt("Enter the special skill: ");

            expList.add(new Experience(ID, FirstName, LastName, DateOfBirth, Address, Phone, Email, Explnyear, ProSkill) );
            if(!Inputter.inputYN("Do you want to continute?"))
                break;
        }
        while(true);
        

    }

    public void showCandidateName(String candidateType){
        System.out.println("==========" + candidateType.toUpperCase() + " CANDIDATE" + "==========");

        for(int i=0; i<expList.size(); i++){
            System.out.println(expList.get(i).FirstName + " " + expList.get(i).LastName);
        }
    }

    public int searchFirstName(String firstName){
        for(Experience i : expList){
            if(i.getFirstName().equals(firstName)){
                return expList.indexOf(i);
            } 
        }
        return -1;
    }

    public int searchLastName(String lastName){
        for(Experience i : expList){
            if(i.getLastName().equals(lastName)){
                return expList.indexOf(i);
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
    
}
