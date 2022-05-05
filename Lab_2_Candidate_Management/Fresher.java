package JavaLab.Lab_2_Candidate_Management;

public class Fresher extends Candidate{
    private int GraduatedDate;
    private String Graduation_rank;
    private String Education;
    final int CandidateType = 1;

    public Fresher(){

    }

    public Fresher(int iD, String firstName, String lastName, int dateOfBirth, String address, String phone,
            String email, int graduatedDate, String graduation_rank, String education) {
        super(iD, firstName, lastName, dateOfBirth, address, phone, email);
        this.GraduatedDate = graduatedDate;
        this.Graduation_rank = graduation_rank;
        this.Education = education;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        this.Education = education;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.Graduation_rank = graduation_rank;
    }

    public int getGraduatedDate() {
        return GraduatedDate;
    }

    public void setGraduatedDate(int graduatedDate) {
        this.GraduatedDate = graduatedDate;
    }

    @Override
    public String toString(){
        return super.toString() + CandidateType; 
    }
    
}
