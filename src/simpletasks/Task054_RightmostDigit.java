package simpletasks;

import java.util.Scanner;

public class Task054_RightmostDigit {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = input.nextInt();
        System.out.print("Input second number: ");
        int b = input.nextInt();
        System.out.print("Input third number: ");
        int c = input.nextInt();
        
        System.out.println("Thre result is: " + result(a, b, c));   
    }
    
    public static boolean result(int a, int b, int c)
    {
        return (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10);
    }
}
