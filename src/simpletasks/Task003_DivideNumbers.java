package simpletasks;

import java.util.Scanner;

public class Task003_DivideNumbers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input fisrt number:");
        int firstNo = input.nextInt();
        System.out.println("Divide it by:");
        int secondNo = input.nextInt();
        
        System.out.println("Divided number is equal to: " + (firstNo / secondNo));
    }
}
