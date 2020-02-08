package simpletasks;

import java.util.Scanner;

public class Task069_HalfOfString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String original = input.nextLine();
        

        
        while (original.length() % 2 != 0)
        {
            System.out.print("String is not of even lenght. Input another: ");
            original = input.nextLine();
        }

        int len = original.length() / 2;
        
        String half = original.substring(0, len);
        
        System.out.println("First half of the string is: " + half);
    }
}
