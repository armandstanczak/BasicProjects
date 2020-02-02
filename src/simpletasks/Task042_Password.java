package simpletasks;

import java.io.Console;

public class Task042_Password {
    
    public static void main(String[] args) {
        
        // cmd
        // find new console tasks
        Console data = System.console();
        if (data != null)
        {
            char pass[]  = null;
            try
            {
                pass = data.readPassword("Input your password: ");
                System.out.println("Your password was: " + new String(pass));
            }
            finally
            {
                if (pass != null)
                {
                    java.util.Arrays.fill(pass, ' ');
                }
            }
        }
        else
        {
            throw new RuntimeException("Can't get password, no console");
        }
    }
}
