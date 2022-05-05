import java.util.ArrayList;
import java.util.StringTokenizer;

public class ContactList extends Contact {
    private ArrayList<Contact> cList;

    public ContactList(){
        setcList(new ArrayList<>());
    }

    public ArrayList<Contact> getcList() {
        return cList;
    }

    public void setcList(ArrayList<Contact> cList) {
        this.cList = cList;
    }

    public static String[] getSeprateName(String name){
        String[] newName = new String[2];
        StringTokenizer sTokenizer = new StringTokenizer(name);
        int index = 0;
        while(sTokenizer.hasMoreTokens()){    
            newName[index] = sTokenizer.nextToken();
            index++;
        }
        return newName;
    }

    public void addContact(){
        String name;
        String group;
        String address;
        String phone;

        while(true){
            name = Inputter.inputStr("Enter Name: ");
            group = Inputter.inputStr("Enter Group: ");
            address = Inputter.inputStr("Enter Address: ");
            phone = Inputter.inputPhoneNumber("Enter Phone: ");
            String[] newName = getSeprateName(name);
            String firstName = newName[0];
            String lastName = newName[1];

            this.cList.add(new Contact((this.cList.size() + 1), name, group, address, phone, firstName, lastName));
            System.out.println("Add successfully");
            char flag = Inputter.inputChar("Do you want to continute to add ?");
            if(flag != 'Y')
                break;
        }
    }

    public void displayContact(){
        if(this.cList.isEmpty())
            System.out.println("Sorry, The list is empty. Please add first");
            
        System.out.println("ID" + "\t" + "Name" + "\t\t" + "First Name" + "\t" + "Last Name" + "\t" + "Group" + "\t" + "Address" + "\t" + "Phone");
        for(Contact i : this.cList){
            System.out.println(i);
        }
    }

    public Contact search(int ID){
        for(Contact i : this.cList){
            if(i.getID() == ID){
                return i;
            }
        }
        return null;
    }

    public void deleteContact(){
        int id = Inputter.inputInt("Enter the ID of contact you want to delete");
        Contact find = search(id);
        if(find != null){
            this.cList.remove(find);
            System.out.println("Deleted");
        }
        else{
            System.out.println("ID not found");
        }
    }

    public void exit(){
        System.out.println("Good Bye");
    }
}
