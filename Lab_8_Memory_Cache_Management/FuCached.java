import java.sql.Date;

public class FuCached {
    private Object data;
    private int expiredDate;

    public FuCached(){

    } 

    public FuCached(Object data, int expiredDate){
        this.data = data;
        this.expiredDate = expiredDate;
    }

    public int getExpiredDate() {
        return expiredDate;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public void setExpiredDate(int expiredDate) {
        this.expiredDate = expiredDate;
    }
}
