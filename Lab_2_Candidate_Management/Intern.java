package JavaLab.Lab_2_Candidate_Management;

public class Intern extends Candidate{
    private String Majors;
    private int Semester;
    private String UniName;
    final int CandidateType = 2;

    public Intern(){

    }

    public Intern(int ID, String FirstName, String LastName, int DateOfBirth, String Address, String Phone,
            String Email, String Majors, int Semester, String UniName) {
        super(ID, FirstName, LastName, DateOfBirth, Address, Phone, Email);
        this.Majors=Majors;
        this.Semester=Semester;
        this.UniName=UniName;
    }
    public String getUniName() {
        return UniName;
    }
    public void setUniName(String uniName) {
        this.UniName = uniName;
    }
    public int getSemester() {
        return Semester;
    }
    public void setSemester(int semester) {
        this.Semester = semester;
    }
    public String getMajors() {
        return Majors;
    }
    public void setMajors(String majors) {
        this.Majors = majors;
    }

    @Override
    public String toString(){
        return super.toString() + CandidateType; 
    }
  
    
}
