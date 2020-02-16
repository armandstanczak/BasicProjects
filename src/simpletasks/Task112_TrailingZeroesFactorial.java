package simpletasks;

import java.util.Scanner;

public class Task112_TrailingZeroesFactorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = input.nextInt();
        
        System.out.println("The number of trailing zeroes is: " + zeroes(a));
    }
    
    public static int zeroes(int a) {
    
        long result = 1;
        int count = 0;
        
        for (int i = 2; i <= a; i++) {
            result = result * i;
        }
        
        System.out.println("Factorial is equal to: " + result);
        
        while (result % 10 == 0) {
            count++;
            result /= 10;
        }
        return count;
    }
}
