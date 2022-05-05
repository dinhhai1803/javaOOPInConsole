public class QuadraticEquation extends Equation{
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(){
        super(2);
    }

    public QuadraticEquation(int a, int b, int c){
        super(a, b);
        this.setC(c);
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public int[] input(){
        int[] arrayNumber = new int[3];
        super.input();
        arrayNumber[2] = this.c = Validation.input("Enter C: ");

        return arrayNumber;
    }

    @Override
    public float[] calculate(){
        float[] result = new float[2];
        int a = super.getA();
        int b = super.getB();
        int c = this.getC();

        System.out.println("-> " + a + b + c);

        int del = b*b - 4*a*c;
        if(del < 0){
            result = null;
        }
        else if(del == 0){
            result[0] = result[1] = -(b / 2*a);
        }
        else{
            result[0] = (float) ((-b + Math.sqrt(del)) / 2 * a);
            result[1] = (float) ((-b - Math.sqrt(del)) / 2 * a);
        }

        this.setResults(result);
        return result;
    }
}
