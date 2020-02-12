package simpletasks;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task087_SumOfDigits {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        
        int length = String.valueOf(number).length();
        int position = 0;
        
        int arrayDigits[] = new int[length];
        
        while (number != 0) {
            arrayDigits[position] = number % 10;
            number /= 10;
            position++;
        }
        
        System.out.println("Sum of digits is: " + sumDigits(number, length, arrayDigits));
    }
    
    public static int sumDigits(int a, int b, int array[]) {
        
        int sum = 0;
        for (int i = 0; i <= b - 1; i++) {
            sum += array[i]; 
        }
        return sum;
    }
}
