package simpletasks;

import java.util.Scanner;

public class Task063_SmallerLarger {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = input.nextInt();
        System.out.print("Input second number: ");
        int second = input.nextInt();
        
        System.out.println("Result is: " + result(first, second));
    }
    
    public static int result(int a, int b)
    {
        if (a == b)
        {
            return 0;
        }
        else if (a % 6 == b % 6)
        {
            return Math.min(a, b);
        }
        else
        {
            return (a > b) ? a : b;
        }
    }
}
