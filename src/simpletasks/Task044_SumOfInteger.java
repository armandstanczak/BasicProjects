package simpletasks;

import java.util.Scanner;

public class Task044_SumOfInteger {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        System.out.println("Sum of numbers " + number + " and " + number + "" + number + " and " + number + "" + number + "" + number + " is: " + sumNumber(number));        
    }
    
    public static int sumNumber(int a)
    {
        int sum;
        return sum = 100 * a + 2 * 10 * a + 3 * a;
    }
}
