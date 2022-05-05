public class Main {
    public static void run(){
        String[] menu = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
        Menu mn = new Menu(menu);
        SuperlativeEquation superEquation = new SuperlativeEquation();
        QuadraticEquation quadraEQuation = new QuadraticEquation();
        int choice = 0;

        do{
            mn.printMenu("======== Equation Program ========".toUpperCase());
            choice = mn.getChoice("Please choose one option: ");
            switch(choice){
                case 1 :{
                    System.out.println("---- Calculate Equation ----".toUpperCase());
                    superEquation.input();
                    superEquation.calculate();
                    superEquation.printResult();
                    superEquation.printOddEven();
                }
                break;

                case 2 :{
                    System.out.println("---- Calculate Quadratic Equation ----".toUpperCase());
                    quadraEQuation.input();
                    quadraEQuation.calculate();
                    if(quadraEQuation.getResults() == null){
                        System.out.println("Equation does not have any solution!!!");
                        break;
                    }
                    quadraEQuation.printResult();
                    quadraEQuation.printOddEven();
                
                }
                break;
                case 3 : {
                    System.out.println("GoodBye");
                }
            }
            System.out.println();
        }
        while(choice > 0 && choice < 3);
    }
    public static void main(String[] args) {
        run();
    }
}
