package simpletasks;

import java.util.Scanner;

public class Task059_LowerLetters {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String sentence = input.nextLine();

        sentence = sentence.toLowerCase();

        System.out.println("The sentence is: " + sentence);
    }
}
