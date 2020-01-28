package simpletasks;

import java.util.Scanner;

public class Task022_BinToDec {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input binary number: ");
        int number = input.nextInt();
        int reminder;
        int decimal = 0;
        int j = 1;
        
        while (number != 0)
        {
            reminder = number % 10;
            decimal = decimal + reminder * j;
            j *= 2;
            number /= 10;
        }
        
        System.out.println("Decimal number is: " + decimal);
    }
}
