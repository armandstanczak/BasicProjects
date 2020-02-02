package simpletasks;

import java.io.File;

public class Task045_SizeOfFile {

    public static void main(String[] args) {
        
        String filePath = "C:\\pagefile.sys";
        File file = new File(filePath);
        
        if (file.exists())
        {
            System.out.println("File path: " + file.getAbsolutePath() + " and size: " + file.length() / 1024 / 1024 + " mb");
        } 
    }  
}
