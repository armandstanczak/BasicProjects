package simpletasks;

import java.util.Scanner;

public class Task065_Modulus {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = input.nextInt();
        System.out.print("Input second number: ");
        int second = input.nextInt();
        
        System.out.println("The reminder is: " + result(first, second));
    }
    
    public static int result(int a, int b)
    {
        int temp = a / b;
        int reminder = a - temp * b;
        return reminder;
    }
}
