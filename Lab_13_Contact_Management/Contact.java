public class Contact {
    private int ID;
    private String fullName;
    private String group;
    private String address;
    private String phone;
    private String firstName;
    private String lastName;

    public Contact(){

    } 

    public Contact(int ID, String fullName, String group, String address, String phone, String firstName, String lastName){
        this.ID = ID;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setID(int iD) {
        this.ID = iD;
    }

    @Override
    public String toString(){
        return this.ID + "\t" + this.fullName + "\t  " + this.firstName + "\t\t" + this.lastName + "\t" + this.group + "\t" + this.address + "\t" + this.phone + "\t" ;
    } 
    
    
}
