package simpletasks;

import java.util.Scanner;

public class Task051_StringToInteger {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("(String)Input a number: ");
        String string = input.nextLine();
        
        int number = Integer.valueOf(string);
        
        System.out.println("The integer value is: " + number);
    }
}
