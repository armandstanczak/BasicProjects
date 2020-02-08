package simpletasks;

import java.util.Scanner;

public class Task073_TwoStringsMissingLetters {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String first = input.nextLine().trim();
        System.out.print("Input another string: ");
        String second = input.nextLine().trim();
        
        if (first.length() == 0)
        {
            first += "#";
        }
        
        if (second.length()== 0)
        {
            second += "#";
        }
        System.out.println(first.substring(0, 1) + second.substring(second.length() - 1, second.length()));
    }
}
