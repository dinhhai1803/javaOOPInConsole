package JavaLab.Lab_10_Change_Base_System;

import java.util.Scanner;

public class Main {

    public static void run(){
        int inputBase, outputBase;
        String inputValue;
        ChangeBaseSystem change = new ChangeBaseSystem();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter the input base (1 is binary, 2 is decimal,  3 is hexadecimal): ");
            inputBase = scanner.nextInt();
            System.out.println("Enter the output base (1 is binary, 2 is decimal,  3 is hexadecimal): ");
            outputBase = scanner.nextInt();
    
            scanner.nextLine();
            System.out.println("Enter the input value: ");
            inputValue = scanner.nextLine();
    
            switch(inputBase){
                case 1 : {
                    change.input(2, inputValue);
                    switch(outputBase){
                        case 2 : {
                            System.out.println("Result in decimal base : " + change.toDecimal(2, change.getBinary()) + " (DEC)");
                        }
                        break;
                        case 3:{
                            int temp = change.toDecimal(2, change.getBinary());
                            change.decimalToWithoutCatch(16, temp);
                        }
                        break;
                    }
                }
                break;
                case 2 : {
                    change.input(10, inputValue);
                    switch(outputBase){
                        case 1:{
                            change.decimalTo(2, change.getDecimal());
                        }
                        break;
                        case 3: {
                            change.decimalTo(16, change.getDecimal());
                        }
                        break;
                    }
                }
                break;
                case 3:{
                    change.input(16, inputValue);
                    switch(outputBase){
                        case 1:{
                            int temp = change.toDecimal(16, change.getHexadecimal());
                            change.decimalToWithoutCatch(2, temp);
                        }
                        break;
                        case 2:{
                            System.out.println("Result in decimal base : " + change.toDecimal(16, change.getHexadecimal()) + " (DEC)");
                        }
                        break;
                    }
                }
                break;
            }
            System.out.println("Do you want to continute ?");
            if(scanner.nextLine().toUpperCase().charAt(0) != 'Y')
                break;
        }



        
    }
    public static void main(String[] args) {
        
        Main main = new Main();
        main.run();
        

    }
}
