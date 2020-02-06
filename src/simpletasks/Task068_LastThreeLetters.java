package simpletasks;

import java.util.Scanner;

public class Task068_LastThreeLetters {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string of 3 or more letters: ");
        String original = input.nextLine();
        
        String last_three_symbols = original.substring(original.length() - 3);
        
        System.out.println("The last three symbols in this weird task are: " + last_three_symbols + last_three_symbols + last_three_symbols + last_three_symbols);
    }
}
