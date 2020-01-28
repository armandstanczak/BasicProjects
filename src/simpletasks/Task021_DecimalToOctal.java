package simpletasks;

import java.util.Scanner;

public class Task021_DecimalToOctal {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = input.nextInt();
        
        int oct[] = new int[100];
        int i = 1;
        
        while (number != 0)
        {
            oct[i] = number % 8;
            number /= 8;
            i++;
        }
        
        System.out.print("Converted to octal is: ");
        
        for (int j = i - 1; j > 0; j--)
        {
            System.out.print(oct[j]);
        }
        System.out.println("");
    }
}
