package JavaLab.Lab_10_Change_Base_System;

import java.util.Scanner;
import java.util.Stack;

public class ChangeBaseSystem {
    private String binary;
    private String decimal;
    private String hexadecimal; 
    
    public ChangeBaseSystem(){

    }

    public ChangeBaseSystem(String binary, String decimal, String hexadecimal){
        this.setBinary(binary);
        this.setDecimal(decimal);
        this.setHexadecimal(hexadecimal);
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    public void input(int base, String value){
        switch(base){
            case 2 : this.binary = value;
            break;
            case 10 : this.decimal = value;
            break;
            case 16 : this.hexadecimal = value;
            break;
        }

    }

    public int toDecimal(int base, String number){
        int newNumber = 0;
        int e = 0;
        for(int i = (number.length() - 1); i >= 0; i-- ){
            //System.out.println(((int)number.charAt(i) - '0') + "  " + (Math.pow(base, e)));
            newNumber += ((int)number.charAt(i) - '0') * (Math.pow(base, e));
            e++;
        }

        return newNumber;
    }

    public static int stringNumberIntoInteger(String number){
        int newNumber = 0;
        int e = 0;
        for(int i = (number.length() - 1); i >= 0; i-- ){
            //System.out.println(((int)number.charAt(i) - '0') + "  " + (Math.pow(10, e)));
            newNumber += ((int)number.charAt(i) - '0') * (Math.pow(10, e));
            e++;
        }
        System.out.println(newNumber);
        return newNumber;
    }

    public static void printStack(int base, Stack stack){
        String baseStr = "";
        if(base == 2)
            baseStr = "binary";
        if(base == 16)
            baseStr = "hexadecimal";

        System.out.print("Result in " + baseStr + " base: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static char changeHexChar(int number){
        char a = 'N';
        switch(number){
            case 10:
                a = 'A';
            break;
            case 11:
                a = 'B';
            break;
            case 12:
                a = 'C';
            break;
            case 13:
                a =  'D';
            break;
            case 14:
                a =  'E';
            break;
            case 15:
                a =  'F';
            break;
        }
        return a;
    }

    public void decimalTo(int base, String number){
        int newNumber = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<Character> stackChar = new Stack<>();

        // change a string number to Integer number
        int IntNumber = stringNumberIntoInteger(number);

        if(base == 16){
            while(true){
                int temp = IntNumber % base;
                if(temp >= 10){
                    stackChar.push(changeHexChar(temp));
                }
                stackChar.push((char) temp);
                if(IntNumber < base)
                break;
                IntNumber = IntNumber / base;
    
            }
            printStack(base, stackChar);
        }
        else{
            while(true){
                stack.push(IntNumber % base);
                if(IntNumber < base)
                break;
                IntNumber = IntNumber / base;
    
            }
            printStack(base, stack);
        }
    }

    public void decimalToWithoutCatch(int base, int number){
        Stack<Integer> stack = new Stack<>();
        Stack<Character> stackChar = new Stack<>();
        int IntNumber = number;

        // while(true){
        //     stack.push(IntNumber % base);
        //     if(IntNumber < base)
        //     break;
        //     IntNumber = IntNumber / base;

        // }
        // printStack(base, stack);
        if(base == 16){
            while(true){
                int temp = IntNumber % base;
                if(temp >= 10){
                    stackChar.push(changeHexChar(temp));
                }
                stackChar.push((char) temp);
                if(IntNumber < base)
                break;
                IntNumber = IntNumber / base;
    
            }
            printStack(base, stackChar);
        }
        else{
            while(true){
                stack.push(IntNumber % base);
                if(IntNumber < base)
                break;
                IntNumber = IntNumber / base;
    
            }
            printStack(base, stack);
        }
    }

}
