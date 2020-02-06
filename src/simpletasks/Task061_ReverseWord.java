package simpletasks;

import java.util.Scanner;

public class Task061_ReverseWord {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = input.nextLine();
        
        String backwards = "";
        char letters[] = word.toCharArray();
        
        for (int i = letters.length - 1; i >= 0; i--)
        {
            backwards += letters[i];
        }
        
        System.out.println("You word written backwards is: " + backwards);
    }
}
