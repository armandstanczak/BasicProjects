package simpletasks;

import java.util.Scanner;

public class Task057_FactorsOfInt {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        
        int counter = 0; 
        
        for (int i = 1; i <= Math.sqrt(number); i++) 
        { 
            if (number % i == 0) 
            {
                if (number / i == i) 
                {
                    counter++;
                } 
                else
                {
                    counter += 2;
                }
            } 
        } 
        
        System.out.println("Number of factors of a number " + number + " is: " + counter);
    }
    
}
