package simpletasks;

import java.util.Scanner;

public class Task060_NextToLastWord {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = input.nextLine();
        
        String words[] = sentence.split(" ");
        System.out.println("Second to last word is: " + words[words.length - 2]);
        
    }
}
