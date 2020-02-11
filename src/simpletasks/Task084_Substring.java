package simpletasks;

import java.util.Scanner;

public class Task084_Substring {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = input.nextLine().trim();
        
        while (sentence.length() < 3)
        {
            System.out.print("Input a longer sentence: ");
            sentence = input.nextLine().trim();
        }
        
        System.out.println("Test data is: " + sentence);
        System.out.println("New output is: " + words(sentence));
    }
    
    public static String words(String abc)
    {
        String shortString = abc.substring(abc.length() - 3, abc.length());
        return shortString + abc + shortString;
    }
}
