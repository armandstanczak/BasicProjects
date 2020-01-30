package simpletasks;

import java.util.Scanner;

public class Task033_SumOfDigits {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = input.nextInt();
        
        System.out.println("Sum of digits is: " + sum(number));
    }
    
    public static int sum(int number)
    {
        int digit[] = new int[32];
        int i = 0;
        int sum = 0;
        
        while (number != 0)
        {
            digit[i] = number % 10;
            number /= 10;
            i++;
        }
        
        for (int j = 0; j <= i; j++)
        {
            sum += digit[j]; 
        }
        
        return sum;
    }
}
