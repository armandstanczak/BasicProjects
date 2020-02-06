package simpletasks;

import java.util.Scanner;

public class Task062_CalculationsX {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number : ");
        int first = input.nextInt();  
        System.out.print("Input second number: ");
	int second = input.nextInt(); 
	System.out.print("Input third number : ");
        int third = input.nextInt();
        
        System.out.println((Math.abs(first - second) >= 20 || Math.abs(second - third) >= 20 || Math.abs(third - first) >= 20));
        
    }
}
