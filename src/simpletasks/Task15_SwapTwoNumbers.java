package simpletasks;

import java.util.Scanner;

public class Task15_SwapTwoNumbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNo = input.nextInt();
        System.out.print("Input second number: ");
        int secondNo = input.nextInt();
        
        int temp = 0;
        
        temp = firstNo;
        firstNo = secondNo;
        secondNo = temp;
        
        System.out.println("First number was: " + secondNo + " and now is: " + firstNo);
        System.out.println("Second number was: " + firstNo + " and now is: " + secondNo);
    }
}
