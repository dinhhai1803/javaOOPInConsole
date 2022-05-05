import java.util.ArrayList;
import java.util.Collections;

public class EastAsiaCountryList extends EastAsiaCountries{
    private ArrayList<EastAsiaCountries> cList ;
    
    public EastAsiaCountryList(){
        cList = new ArrayList<>();
    } 

    public void setCList(ArrayList<EastAsiaCountries> cList){
        this.cList = cList;
    }

    public ArrayList<EastAsiaCountries> getCList(){
        return this.cList;
    }
    
    public void inputCountry(){
        String code, name, terrain;
        float area;

        Inputter.inputStr("");
        while(true){
            code = Inputter.inputStr("Enter code of country: ");
            name = Inputter.inputStr("Enter name of country: ");
            area = Inputter.inputFloat("Enter tatal Area: ");
            terrain = Inputter.inputStr("Enter terrain of country: ");
    
            this.cList.add(new EastAsiaCountries(code, name, area, terrain));
            System.out.println("Input successfully");
            if(Inputter.inputChar("Do you want to continute ? ") != 'Y' )
                break;
        }


    }

    public void displayCountry(){
        System.out.println("ID" + "\t\t" + "Name" + "\t\t" + "Total Area" + "\t\t" + "Terrain");
        for(EastAsiaCountries i : this.cList){
            System.out.println(i.toString());
        }
    }

    public void searchCountrybyName(){
        Inputter.inputStr("");
        String name = Inputter.inputStr("Enter the name you want to search: ");
        EastAsiaCountries s = search(name);
        if(s == null){
            System.out.println("Country not found!!!");
        }
        else{
            System.out.println("Country found: ");
            System.out.println("ID" + "\t\t" + "Name" + "\t\t" + "Total Area" + "\t\t" + "Terrain");
            System.out.println(s);
        }
    }

    public void displayAfterSort(){
        Collections.sort(this.cList);
        displayCountry();
    }

    public EastAsiaCountries search(String searchName){
        for(EastAsiaCountries i : this.cList){
            if(i.getCountryName().equals(searchName))
                return i;
        }
        return null;
    }
}
