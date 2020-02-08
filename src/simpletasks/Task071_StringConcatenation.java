package simpletasks;

import java.util.Scanner;

public class Task071_StringConcatenation {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first string: ");
        String first = input.nextLine().trim();
        
        while (first.length() < 1)
        {
            System.out.print("To short, whire another string: ");
            first = input.nextLine().trim();
        }
        
        System.out.print("Input another string: ");
        String second = input.nextLine().trim();
        
        while (second.length() < 1)
        {
            System.out.print("To short, whire another string: ");
            second = input.nextLine().trim();
        }
        
        String firstShort = first.substring(1);
        String secondShort = second.substring(1);
        
        System.out.println("Output: " + firstShort + secondShort);
    }
}
