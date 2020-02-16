package simpletasks;

import java.util.Scanner;

public class Task118_FindString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Input a word to find: ");
        String word = input.nextLine();
        
        System.out.println("The word you are looking for starts in position: " + (1 + sentence.indexOf(word)));
    }
}
