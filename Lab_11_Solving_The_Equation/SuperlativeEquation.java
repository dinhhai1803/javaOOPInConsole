public class SuperlativeEquation extends Equation{
    private int a;
    private int b;

    public SuperlativeEquation(){
        super(1);
    }

    public SuperlativeEquation(int a, int b){
        super(a, b);
    }

    @Override
    public float[] calculate(){
        float[] result = new float[1];
        try {
            result[0] = (-((float)super.getB()) / ((float)super.getA()));
            this.setResults(result);
            return result;
        } catch (Exception e) {
            System.out.println(super.getA());
            System.out.println(super.getB());
        }
        return result;
    }
}
