public class Expense{
    private int ID;
    private String date;
    private double number;
    private String content;

    public Expense(int ID, String date, double number, String content ){
        this.ID = ID;
        this.date = date;
        this.number = number;
        this.content = content;
    }
    
    public int getID() {
        return ID;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public double getNumber() {
        return number;
    }
    public void setNumber(double number) {
        this.number = number;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setID(int iD) {
        this.ID = iD;
    }

    public String toString(){
        return this.ID + "\t" + this.date + "\t" + this.number + "\t"  + this.content + "\t" ;
    }
}