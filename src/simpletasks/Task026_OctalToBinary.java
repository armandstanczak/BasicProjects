package simpletasks;

import java.util.Scanner;

public class Task026_OctalToBinary {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input octal number: ");
        int octal = input.nextInt();
        
        int i = 0;
        int j = 2;
        int decimal = 0;
        int reminder;
        
        while (octal != 0)
        {
            reminder = octal % 10;
            octal /= 10;
            decimal = (int) (decimal + reminder * Math.pow(8, i));
            i++;
        }
        
        System.out.println("Decimal is: " + decimal);
      
        int bin[] = new int[64];
        int x = 1;
        
        while (decimal != 0)
        {
            bin[x] = decimal % 2;
            decimal /= 2;
            x++;
        }
        
        System.out.print("Binary is: ");
        
        for (int h = x - 1; h > 0; h--)
        {
            System.out.print(bin[h]);
        }
        
        System.out.println("");
    }
}
