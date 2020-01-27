package simpletasks;

import java.util.Scanner;

public class Task2_SumTwoNumbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Inpur first number:");
        int firstNo = input.nextInt();
        System.out.println("Input second number:");
        int secondNo = input.nextInt();
        
        System.out.println("Sum is equal to: " + (firstNo + secondNo));
    }
}
