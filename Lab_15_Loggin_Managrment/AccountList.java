import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AccountList {
    private ArrayList<Account> aList;
    private String url = "text.txt";

    public AccountList(){
        this.aList = new ArrayList<>();
    }

    public Account search(String name){
        for(Account i : this.aList){
            if(i.getUserName().equals(name))
                return i;
        }
        return null;
    } 

    public Account searchPass(String pass){
        for(Account i : this.aList){
            if(i.getPassword().equals(pass))
                return i;
        }
        return null;
    } 

    public void create(){
        String name, pass;

        while(true){
            name = Inputter.inputStr("Enter Username: ", 5);
            if(search(name) == null)
                break;
            else
                System.out.println("Username has been existed. Try again!");
        }
        pass = Inputter.inputStr("Enter password: ", 6);
        this.aList.add(new Account(name, pass));
        System.out.println("Username created!");
    }

    public void writeToFile() throws IOException{
        File newFile = new File(this.url);
        if(!newFile.exists()){
            System.out.println("File not exists. Created new file name " + this.url + ".txt");
            newFile.createNewFile();
        }

        FileWriter f = new FileWriter(newFile);
        if(this.aList.isEmpty())
            System.out.println("The list is empty!");
        else{
            for(Account i : this.aList){
                f.write(i.toString());
                f.write("\n");
            }
        } 
        f.close(); 
    }

    public Account filter(String info){
        String[] b = info.split("\\s+");
        return new Account(b[0], b[1]);
    }

    public void readFile() throws IOException{
        File newFile = new File(this.url);
        String line;
        
        if(!newFile.exists()){
            System.out.println("File does not exists");
            newFile.createNewFile();
        }

        FileReader r = new FileReader(newFile);
        BufferedReader reader = new BufferedReader(r);
        while((line = reader.readLine()) !=null){
            this.aList.add(filter(line));
        }
        reader.close();
    }

    public void displayAllAccount(){
        System.out.println("All acount: ");
        for(Account i : this.aList){
            System.out.println(i);
        }
    }

    public void createAccount(){
        System.out.println("------ CREATE ACCOUNT ------");
        create();
        try{   
            writeToFile();
        }
        catch(IOException e){
            System.out.println("Error: " + e);
        }
    }

    public String[] inputInfor(){
        String[] s = new String[2];
        String name, pass;
        name = Inputter.inputStr("Enter Username: ", 5);
        pass = Inputter.inputStr("Enter password: ", 6);
        s[0] = name;
        s[1] = pass;
        return  s;
    }

    public boolean checkInfor(String[] s){
        if(search(s[0]) != null && searchPass(s[1]) != null)
            return true;
        return false;
    }

    public void loginSystem(){
        String[] input;
        int count = 0;
        System.out.println("------ LOGIN SYSTEM ------");
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        while(true){
            input = inputInfor();
            if(checkInfor(input)){
                System.out.println("Login successfully");
                break;
            }
            else{
                count ++;
                if(count == 3){
                    System.out.println("Invalid account 3 times");
                    break;
                }
                System.out.println("Username or Password incorrect. Try again!");
            }
        }
    }

    public void exit(){
        System.out.println("Program exited");
    }
}
