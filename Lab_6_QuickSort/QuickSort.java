package JavaLab.Lab_6_QuickSort;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    private int[] array;
    private int number;

    public QuickSort(){
    }

    public QuickSort(int[] array, int number){
        this.array = array;
        this.number = number;
    }

    public int[] getArray(){
        return this.array;
    }

    public int getNumber(){
        return this.number;
    }

    public void setArray(int[] array){
        this.array = array;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void inputNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        this.number = scanner.nextInt();
    }

    static int inputNewNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        return scanner.nextInt();
    }

    public void createRandomArray(){
        Random random = new Random();
        this.array = new int[this.number];
        for(int i=0; i<this.number; i++){
            array[i] = random.nextInt(this.number);
        }
    }

    static int[] createNewRandomArray(int number){
        Random random = new Random();
        int[] array = new int[number];
        for(int i=0; i<number; i++){
            array[i] = random.nextInt(number);
        }
        return array;
    }

    public void createKeyboardArray(){
        this.array = new int[this.number];
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        for(int i : array){
            System.out.println("Number " + index++ + " = ");
            i = scanner.nextInt();
        }
    }

    static int[] createNNewKeyboardArray(int number){
        int[] array = new int[number];
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        for(int i : array){
            System.out.println("Number " + index++ + " = ");
            i = scanner.nextInt();
        }
        return array;
    }

    public void QuickSortAlgorithm(){
        quickSort(this.array, 0, this.array.length - 1);
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

    public void print(String msg){
        System.out.print(msg);
        for(int i : this.array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
