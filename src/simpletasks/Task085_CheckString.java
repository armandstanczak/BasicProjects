package simpletasks;

import java.util.Scanner;

public class Task085_CheckString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string to check: ");
        String sentence = input.nextLine();
        System.out.print("Input a word: ");
        String word = input.nextLine();
        
        System.out.println("Method 1 - output is: " + checkSentence(sentence, word));
        System.out.println("Method 2 - output is: " + sentence.startsWith(word));
    }
    
    public static boolean checkSentence(String abc, String def) {
        
        int len = def.length();
        String sub = abc.substring(0, len);
        return (sub.equals(def));
    }
}
