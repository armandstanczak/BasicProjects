package simpletasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task108_ToSingleDigit {
    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = input.nextInt();
        int i = 0;
        
        while (a > 9) {
            
            int digits[] = new int[20];
            
            while (a != 0) {
                digits[i] = a % 10;
                a /= 10;
                i++;
            }
        
            System.out.println(Arrays.toString(digits));
            a = 0;
            
            for (int j = 0; j <= digits.length - 1; j++) {
                a += digits[j];
            }
            i = 0;
        }
        System.out.println("Sum of digits is: " + a);
    }
}
