package simpletasks;

import java.nio.charset.Charset;

public class Task040_ListOfCharSet {

    public static void main(String[] args) {
        
        System.out.println("List of available character sets: ");
        for(String data : Charset.availableCharsets().keySet())
        {
            System.out.println(data);
        }
    }
    
}
