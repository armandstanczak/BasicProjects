package simpletasks;

import java.util.Scanner;

public class Task041_ASCIIChar {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a character: ");
        char character = input.next().charAt(0);
        
        System.out.println("The ASCII value of " + character + " is: " + (int)character);
        
    }
}
