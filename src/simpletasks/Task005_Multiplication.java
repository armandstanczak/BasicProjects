package simpletasks;

import java.util.Scanner;

public class Task005_Multiplication {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNo = input.nextInt();
        System.out.print("Input second number: ");
        int secondNo = input.nextInt();
        
        System.out.println("Output: " + (firstNo * secondNo));
        
    }
}
