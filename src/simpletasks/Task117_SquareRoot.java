package simpletasks;

import java.util.Scanner;

public class Task117_SquareRoot {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double number = input.nextInt();
        
        System.out.println("The square root of number " + (int) number + " is " + sqrt(number));
    }
    
    public static double sqrt(double a) {
        
        a = Math.abs(a);
        return Math.sqrt(a);
    }
}
