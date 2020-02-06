package simpletasks;

import java.util.Scanner;

public class Task067_InsertWord {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Input a word: ");
        String word = " " + input.nextLine() + " ";

        String words[] = sentence.split(" ");
        int middle = words.length / 2;
        
        System.out.println("The sentence with added word in the middle is: ");
        if (words.length % 2 == 0)
        {
            for(int i = 0; i <= words.length -1; i++)
            {
                if (i == middle - 1)
                {
                    System.out.print(words[i] + word);
                }
                else
                {
                    System.out.print(words[i] + " ");
                }
            }    
        }
        else
        {
            middle += 1;
            for(int i = 0; i <= words.length -1; i++)
            {
                if (i == middle - 1)
                {
                    System.out.print(words[i] + word);
                }
                else
                {
                    System.out.print(words[i] + " ");
                }
            }    
        }
        System.out.println("\n");
    }
}
