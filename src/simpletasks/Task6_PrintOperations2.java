package simpletasks;

import java.util.Scanner;

public class Task6_PrintOperations2 {
      
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input fisrt number:");
        int firstNo = input.nextInt();
        System.out.println("Divide it by:");
        int secondNo = input.nextInt();
        
        System.out.println("Addition: " + (firstNo + secondNo));  
        System.out.println("Subtraction: " + (firstNo - secondNo));  
        System.out.println("Multiplication: " + (firstNo * secondNo));  
        System.out.println("Division: " + (firstNo / secondNo));  
        System.out.println("Modulo: " + (firstNo % secondNo));  

    }
}
