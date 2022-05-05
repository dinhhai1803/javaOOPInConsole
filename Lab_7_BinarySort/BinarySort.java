package JavaLab.Lab_7_BinarySort;

import java.util.Random;
import java.util.Scanner;

public class BinarySort {
    private int[] array;
    private int number;
    private int x;

    public BinarySort(){

    }

    public BinarySort(int[] array, int number, int x){
        this.array = array;
        this.number = number;
        this.x = x;
    }

    public int[] getArray(){
        return this.array;
    }

    public int getNumber(){
        return this.number;
    }

    public int getX(){
        return this.x;
    }

    public void setArray(int[] array){
        this.array = array;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setX(int x){
        this.x = x;
    }

    public int inputNumber(String msg, String element){
        int number;
        while(true){
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.println(msg);
                number = Integer.parseInt(scanner.nextLine());
                if(number <= 0) throw new Exception();
                if(element == "array")
                    this.number = number;
                else if(element == "value")
                    this.x = number;
                break;
            }
            catch(Exception e){
                System.out.println("Enter a positive number!");
            }
        }
        return number;
    }

    public int[] createArray(){
        Random random = new Random();
        this.array = new int[this.number];

        for(int i=0; i<this.number; i++){
            this.array[i] = random.nextInt(this.number);
        }
        return this.array;
    }

    public void printArray(String msg){
        System.out.println(msg);
        for(int i : this.array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int binarySearch(int low, int high){

      int mid;
        if(low > high) return -1;
        else{
            mid = low + (high - low)/2;
            if(this.x == this.array[mid]) return mid;
            else if(this.x < this.array[mid]) return binarySearch(low, mid - 1);
            else return binarySearch(mid + 1, high);
        }
    }

    public void quickSort(int[] array, int start, int end){
        if(start >= end) return;            

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);     
        quickSort(array, pivot + 1, end);       
    }

    public int partition(int[] array, int start, int end){
        int pivot = array[end];                 
        int i = start - 1;                      
        
        for(int j = start; j <= end - 1; j++){
            if(array[j] < pivot){
                i++;                            
                int temp = array[i];            
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;                           
        int temp = array[i];           
        array[i] = array[end];
        array[end] = temp;
        return i;
    }

}
