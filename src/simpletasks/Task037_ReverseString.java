package simpletasks;

import java.util.Scanner;

public class Task037_ReverseString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        char sentence[] = input.nextLine().toCharArray();
        
        System.out.print("Reverse string is: ");
        for (int i = sentence.length - 1; i >= 0; i--)
        {
            System.out.print(sentence[i]);
        }
        System.out.println("");
    }
}
