public class Student{
    private String sName;
    private String sClass;
    private int math;
    private int chemistry;
    private int physic;
    private float avg;
    private char type;

    public Student(String name, String sclass, int math, int chemistry, int physic){
        this.sName = name;
        this.sClass = sclass;
        this.math = math;
        this.chemistry = chemistry;
        this.physic = physic;
    }

    public Student(String name, String sclass, int math, int chemistry, int physic, float avg, char type){
        this.sName = name;
        this.sClass = sclass;
        this.math = math;
        this.chemistry = chemistry;
        this.physic = physic;
        this.avg = avg;
        this.type = type;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getPhysic() {
        return physic;
    }

    public void setPhysic(int physic) {
        this.physic = physic;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String toString(){
        return "Name: " + this.sName + "\n" + "Name: " + this.sClass + "\n" + "Name: " + this.math + "\n" + "Name: " + this.chemistry + "\n" + "Name: " + this.physic + "\n";
    }
} 