package simpletasks;

import java.util.Scanner;

public class Task038_LetterCount {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        char sentence[] = input.nextLine().toCharArray();
        
        System.out.println("The length of a sentence is: " + sentence.length);
        
        int letter = 0; 
        int space = 0;
        int number = 0;
        int other = 0;
        
        
        for (int i = 0; i <= sentence.length - 1; i++)
        {
            if (Character.isDigit(sentence[i]))
            {
                number++;
            }
            else if (Character.isLetter(sentence[i]))
            {
                letter++;
            }
            else if (Character.isSpaceChar(sentence[i]))
            {
                space++;
            }
            else
            {
                other++;
            }
        }
        
        System.out.println("Numer of letters: " + letter);
        System.out.println("Number of spaces: " + space);
        System.out.println("Number of numbers: " + number);
        System.out.println("Number of other symbols: " + other);
    }
}
