package simpletasks;

import java.util.Scanner;

public class Task115_Palindrome {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        
        boolean palindrome = palindrome(number);
        
        if (palindrome == true) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
    
    public static boolean palindrome(int a) {
        
        String string = String.valueOf(a);
        int i = 0;
        int j = string.length() - 1;
        
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            j--;
            i++;
        }
            return true;         
    }
}