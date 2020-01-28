package simpletasks;

import java.util.Scanner;

public class Task019_Decimal2Binary {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        int number = input.nextInt();
        
        int bin[] = new int[64];
        int i = 1;
        
        while (number != 0)
        {
            bin[i] = number % 2;
            number = (number - (number % 2)) / 2;
            i++;
        }
        
        System.out.println("Converted to binary: ");
        for (int j = i - 1; j > 0; j--)
        {
            System.out.print(bin[j]);
        }
        
        System.out.println("");
    }
}
