package simpletasks;

import java.util.Scanner;

public class Task086_RandomCalculations {
    
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input a number: ");
            int number = input.nextInt();
            
            
            int counter = 0;
            
            while (number != 1) {
                System.out.println(counter + ": " + number);
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = (number * 3 + 1);
                }
                counter++;
            }

            System.out.println("Number of iterations was: " + counter);
        }
    }
}