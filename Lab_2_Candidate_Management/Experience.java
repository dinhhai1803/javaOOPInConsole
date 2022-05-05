package JavaLab.Lab_2_Candidate_Management;

public class Experience extends Candidate {
    private int ExplnYear;
    private String ProSkill;
    final int CandidateType = 0;

    public Experience(){
        
    }

    public Experience(int ID, String FirstName, String LastName, int DateOfBirth, String Address, String Phone,
            String Email, int Explnyear, String ProSkill) {
        super(ID, FirstName, LastName, DateOfBirth, Address, Phone, Email);
        this.ExplnYear = Explnyear;
        this.ProSkill = ProSkill;
    }

    public int getExYear(){
        return ExplnYear;
    }

    public String getProSkill(){
        return ProSkill;
    }

    public void setExYear(int ExYear){
        this.ExplnYear = ExYear;
    }

    public void setProSkill(String ProSkill){
        this.ProSkill = ProSkill;
    }

    @Override
    public String toString(){
        return super.toString() + CandidateType; 
    }

}
