package JavaLab.Lab_2_Candidate_Management;

public class Candidate{
    protected int ID;
    protected String FirstName;
    protected String LastName;
    protected int DateOfBirth;
    protected String Address;
    protected String Phone;
    protected String Email;

    public Candidate(){
        
    }

    public Candidate(int ID, String FirstName, String LastName, int DateOfBirth, String Address, String Phone, String Email ){
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
    }

    public int getID(){
        return ID;
    }

    public String getFirstName(){
        return FirstName;
    }

    public String getLastName(){
        return LastName;
    }

    public int getBirthday(){
        return DateOfBirth;
    }

    public String getAddress(){
        return Address;
    }

    public String getPhone(){
        return Phone;
    }

    public String getEmail(){
        return Email;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName){
        this.LastName = LastName;
    }

    public void setBirthday(int DateOfBirth){
        this.DateOfBirth = DateOfBirth;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

    public void setPhone(String Phone){
        this.Phone = Phone;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }

    public String toString(){
        return FirstName + " " + LastName + " | " 
        + DateOfBirth + " | " + Address + " | " + Phone + " | " ;
    }

}