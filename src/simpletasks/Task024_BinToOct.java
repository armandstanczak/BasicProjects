package simpletasks;

import java.util.Scanner;

public class Task024_BinToOct {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input binary number: ");
        int binary = input.nextInt();
        
        int decimal = 0;
        int reminder;
        int i = 1;
        
        while (binary != 0)
        {
            reminder = binary % 10;
            decimal += reminder * i;
            binary /= 10;
            i *= 2;
        }
        
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal number: " + octal);
       
    }
}
