package simpletasks;

import java.util.Scanner;

public class Task058_CapitalizeLetters {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = input.nextLine();
        
        Scanner newSentence = new Scanner(sentence);
        String upperLine = "";
        
        while(newSentence.hasNext())
        {
            String word = newSentence.next();
            upperLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        
        System.out.println(upperLine);
    }
}
