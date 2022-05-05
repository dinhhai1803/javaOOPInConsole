import java.util.ArrayList;

public class Equation {
    private int a;
    private int b;
    private float[] results;
    private int numberOfResults;

    public Equation(int number){
        this.numberOfResults = number;
        this.results = new float[number];
    }

    public Equation(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getNumberOfResults() {
        return numberOfResults;
    }

    public void setNumberOfResults(int numberOfResults) {
        this.numberOfResults = numberOfResults;
    }
  

    public float[] getResults() {
        return results;
    }

    public void setResults(float[] results) {
        this.results = results;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int[] input(){
        int[] arraynumber = new int[2];
        System.out.println("Please input number");
        arraynumber[0] = this.a = Validation.input("Enter A: ");
        arraynumber[1] = this.b = Validation.input("Enter B: ");

        return arraynumber;
    }

    public float[] calculate(){
        float[] result = new float[this.numberOfResults];
        this.results = result;
        return result;
    }

    public void printResult(){
        System.out.print("Result(s)  :  ");
        for(int i = 0; i < this.results.length; i++){
            System.out.print("x" + (i+1) + " = " + this.results[i] + ", ") ;

        }
        System.out.println();
    }

    public void printOddEvenResults(ArrayList<Float> arr, String msg){
        System.out.print(msg);
        if(arr.size() == 0)
            System.out.println("Does not exist any value");
        for(int i = 0; i < arr.size(); i++){
            System.out.print("Number " + (i+1) + " = " + arr.get(i) + ", ") ;
        }
        System.out.println();
    }

    public void printOddEven(){
        ArrayList oddNumber = new ArrayList();
        ArrayList evenNumber = new ArrayList();

        if(this.a %2 ==0)
            evenNumber.add(this.a);
        else
            oddNumber.add(this.a);

        if(this.b %2 ==0)
            evenNumber.add(this.b);
        else
            oddNumber.add(this.b);

        for(int i = 0; i < this.results.length; i++){
            if(this.results[i] % 2 == 0)
                evenNumber.add(this.results[i]);
            else    
                oddNumber.add(this.results[i]);
        }

        printOddEvenResults(oddNumber, "Odd number(s): ");
        printOddEvenResults(evenNumber, "Even number(s): ");
        
    }
    
}
