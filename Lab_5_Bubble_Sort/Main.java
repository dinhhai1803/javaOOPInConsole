
import java.util.Random;
import java.util.Scanner;

public class Main {
    
    
    static int input(){
    Scanner scanner = new Scanner(System.in);
    int number = 0;
        do{
            try{
                System.out.println("Enter number of array: ");
                number = Integer.parseInt(scanner.nextLine());
                if(number < 0 ) throw new Exception("Enter the positive number!!!");
                return number;
            }
            catch(Exception e){
                System.out.println("Error: " + e);
                System.out.println("Enter again");
            }
        }while(true);
    }

    static void print(int[] a, String msg){
        System.out.println(msg);
        for(int i : a){
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int[] a){
        for(int i=0; i<a.length - 1; i++){
            for(int j=0; j<a.length-1-i; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static int[] create(int number){
        Random random = new Random();
        int[] array = new int[number];
        for(int i=0; i<number; i++ ){
            array[i] = random.nextInt(number);
        }
        return array;
    }

    public static void main(String[] args) {
        
        int number = input();
        int[] array = create(number);


        print(array, "Before sorting");
        System.out.println();
        bubbleSort(array);
        print(array, "After sorting");
    }
}
