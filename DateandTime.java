import java.time.*;
import java.time.format.*;
public class DateandTime {
    public static void main(String args[]) {
        LocalDateTime now = LocalDateTime.now();  
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  

System.out.println(dtf.format(now));

        
    }
}
