package simpletasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task047_DisplayTime {

    public static void main(String[] args) {
        
        System.out.format("Date now is: %s\n", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
        
    }
    
}
