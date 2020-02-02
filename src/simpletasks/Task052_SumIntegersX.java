package simpletasks;

import java.util.Scanner;

public class Task052_SumIntegersX {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int first = input.nextInt();
        System.out.print("Input second integer: ");
        int second = input.nextInt();
        System.out.print("Input third integer: ");
        int third = input.nextInt();
        
        System.out.println("The result is: " + calculatedSum(first, second, third));
    }
    
    public static boolean calculatedSum(int a, int b, int c)
    {
        return a + b == c;
    }
}
