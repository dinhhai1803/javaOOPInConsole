import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

public class FuMemoryCached {
    static HashMap<String, FuCached> cached;
    public static LocalDate day = LocalDate.now();

    public FuMemoryCached(){
        cached = new HashMap<>();
    }

    public void putObject(String key, Object object, int timeToLive){
        cached.put(key, new FuCached(object, timeToLive));
        System.out.println("Successfully");
    }

    public static Object getObject(String key){
        for(String i : cached.keySet()){
            if(i.equals(key)){
                if(day.getDayOfMonth() < cached.get(i).getExpiredDate()){
                    return cached.get(i);
                }
                else{
                    cached.remove(i);
                }
            }
        }
        return null;
    }

    public static void clean(String key){
        cached.remove(key);
        System.out.println("Removed");
    } 

    public void cleanAll(){
        cached.clear();
        System.out.println("Cleared");
    }

    public static void main(String[] args) {
        FuMemoryCached fuMemoryCached = new FuMemoryCached();
        
    }
    
}
