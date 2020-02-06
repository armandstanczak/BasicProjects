package simpletasks;

import java.util.Scanner;

public class Task064_CommonDigit {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = input.nextInt();
        
        if (first < 25 || first > 75)
        {
            System.out.print("The number has to be between 25 and 75. Write another number: ");
            first = input.nextInt();
        }
      
        System.out.print("Input second number: ");
        int second = input.nextInt();
        
        if (second < 25 || second > 75)
        {
            System.out.print("The number has to be between 25 and 75. Write another number: ");
            second = input.nextInt();
        }
        
        System.out.println("The result is: " + result(first, second));
    }
    
    public static boolean result(int a, int b)
    {
        int ax = a / 10;
        int ay = a % 10;
        int bx = b / 10;
        int by = b % 10;
        
        return (ax == bx || ax == by || ay == bx || ay == by);
    }
}
