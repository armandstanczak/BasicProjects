package simpletasks;

import java.util.Scanner;

public class Task053_ThreeNumbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int first = input.nextInt();
        System.out.print("Input second integer: ");
        int second = input.nextInt();
        System.out.print("Input third integer: ");
        int third = input.nextInt();
        System.out.print("Is abc true (write 1 for true or 0 for false)? ");
        int abc = input.nextInt();
        
        System.out.println("The result is: " + calculatedNumbers(first, second, third, abc));
    }
    
    public static boolean calculatedNumbers(int a, int b, int c, int d)
    {
        if (b > a && c > b)
        {
            return true;
        }
        else return d == 1 && c > b;
    }
}
