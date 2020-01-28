package simpletasks;

import java.util.Scanner;

public class Task012_AverageThreeNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNo = input.nextInt();
        System.out.print("Input second number: ");
        int secondNo = input.nextInt();
        System.out.print("Input third number: ");
        int thirdNo = input.nextInt();
        
        double average = (double)(firstNo + secondNo + thirdNo) / 3;
        
        System.out.println("Average is: " + average);
    }
    
}
