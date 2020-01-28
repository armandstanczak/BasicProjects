package simpletasks;

import java.util.Scanner;

public class Task25_OctalToDecimal {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Input octal number: ");
        int octal = input.nextInt();
        
        int decimal = 0;
        int i = 0;
        
        while (octal != 0)
        {
            decimal = (int) (decimal + (octal % 10) * (Math.pow(8, i)));
            octal /= 10;
            i++;
        }
        
        System.out.println(decimal);
        
    }
}
