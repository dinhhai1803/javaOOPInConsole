public class Main {
    public static void run(){
        EastAsiaCountryList eCountries = new EastAsiaCountryList();
        String[] menu = {"Input the information of 11 countries in East Asia",
                                "Display the information of country you've just input",
                                "Search the information of country by user-entered name",
                                "Display the information of countries sorted name in ascending order",
                                "Exit "};

        Menu mn = new Menu(menu);
        int choice = 0;
        do{
            mn.showMenu();
            choice = mn.getChoice();
            switch(choice){
                case 1: {
                    eCountries.inputCountry();
                }
                break;
                case 2:{
                    eCountries.displayCountry();
                }
                break;
                case 3:{
                    eCountries.searchCountrybyName();
                }
                break;
                case 4:{
                    eCountries.displayAfterSort();
                }
                break;
                case 5:{
                    System.out.println("Good Bye");
                }
            }

        }
        while(choice > 0 && choice < 5);
    }

    public static void main(String[] args) {
        run();
    }
}
