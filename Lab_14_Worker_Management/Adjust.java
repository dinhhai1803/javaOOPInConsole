
public class Adjust {
    private String status;
    private String date;

    public Adjust(){

    }

    public Adjust(String status, String date){
        this.date = date;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return this.status + "\t" + this.date;
    }
}
