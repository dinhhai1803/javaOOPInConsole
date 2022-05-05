package JavaLab.Lab_2_Candidate_Management;


public class CandidateManagerment {
    String[] menu = {"Experience", "Fresher", "Internship", "Search", "Exit"};
    String msg = "( Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate,3 to Create Internship Candidate, 4 to Searching anf 5 to Exit program )";
    
    public static ExpList expList = new ExpList();
    FreList freList = new FreList();
    IntList intList = new IntList();

    public void run(){
        int choice = 0;
        
        do{
            showMenu();
            choice = Inputter.inputInt("Your choice: ");
            switch(choice){
                case 1 : createExpCandidate();
                break;
                case 2 : createFreCandidate();
                break;
                case 3 : createIntCandidate();
                break;
                case 4 : searchCandidate();
                break;
            }

        }while(choice > 0 && choice < 5);

    }

    
    public void showMenu(){
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        for(int i=0; i<menu.length; i++){
            System.out.println((i+1) + ".   " +  menu[i]);
        }
        System.out.println(msg);
    }

    public void createExpCandidate(){
        expList.create();
    }

    public void createFreCandidate(){
        freList.create();
    }

    public void createIntCandidate(){
        intList.create();
    }

    public void searchCandidate(){
        String firstName;
        String lastName;
        int canType;

        System.out.println("LIST OF CANDIDATE: ");
        expList.showCandidateName("Expericene");
        System.out.println();
        freList.showCandidateName("Fresher");
        System.out.println();
        intList.showCandidateName("Intern");
        System.out.println();
        String temp = Inputter.inputSrt("Input Candidate name (First name or Last name): ");
        canType = Inputter.inputInt("Input type of candidate (0 for Experience, 1 for Fresher and 2 for Intern): ");
        switch(canType){
            case 0: {
                //expList.showCandidateName("Expericene");
                //String temp = Inputter.inputSrt("Input Candidate name (First name or Last name): ");
                firstName = lastName = temp;
                expList.find(firstName, lastName, canType);
                break;
            }
            case 1: {
                //freList.showCandidateName("Fresher");
                //String temp = Inputter.inputSrt("Input Candidate name (First name or Last name): ");
                firstName = lastName = temp;
                freList.find(firstName, lastName, canType);
                break;
            }
            case 2: {
                //intList.showCandidateName("Intern");
                //String temp = Inputter.inputSrt("Input Candidate name (First name or Last name): ");
                firstName = lastName = temp;
                intList.find(firstName, lastName, canType);
                break;
            }
        }


    }

    public static void main(String[] args) {
    CandidateManagerment candidateManagerment = new CandidateManagerment();
    
    candidateManagerment.run();
    }
}
