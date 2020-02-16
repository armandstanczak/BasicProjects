package simpletasks;

import java.util.Scanner;

public class Task111_AddingWithoutSymbols {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = input.nextInt();
        System.out.print("Input second number: ");
        int second = input.nextInt();
        
        System.out.println("Sum of those numbers is: " + sum(first, second));
    }
    
    public static int sum(int a, int b) {
        
        return Math.addExact(a, b);
    }
}
