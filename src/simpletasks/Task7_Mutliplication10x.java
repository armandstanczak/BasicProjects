package simpletasks;

import java.util.Scanner;

public class Task7_Mutliplication10x {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        
        System.out.println("Expected output:");
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
    
}
