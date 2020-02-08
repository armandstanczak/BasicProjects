package simpletasks;

import java.util.Scanner;

public class Task070_TwoStrings {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Write a string: ");
        String first = input.nextLine().trim();
        System.out.print("Write another string: ");
        String second = input.nextLine().trim();
        
        String shorter;
        String longer;
        
        if (first.length() > second.length())
        {
            shorter = second;
            longer = first;
        }
        else
        {
            shorter = first;
            longer = second;
        }
        
        System.out.println(shorter + " " + longer + " " + shorter);
        
    }
}
