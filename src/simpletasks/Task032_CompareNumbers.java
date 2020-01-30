package simpletasks;

import java.util.Scanner;

public class Task032_CompareNumbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int first = input.nextInt();
        System.out.print("Input second number: ");
        int second = input.nextInt();
        
        if (first == second)
        {
            System.out.println(first + " == " + second);
        }
        if (first != second)
        {
            System.out.println(first + " != " + second);
        }
        if (first < second)
        {
            System.out.println(first + " < " + second);
        }
        if (first > second)
        {
            System.out.println(first + " > " + second);
        }
        if (first <= second)
        {
            System.out.println(first + " <= " + second);
        }
        if (first >= second)
        {
            System.out.println(first + " >= " + second);
        }
    }
}
