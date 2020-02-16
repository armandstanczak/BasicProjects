package simpletasks;

import java.util.Scanner;

public class Task114_RotateString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.nextLine();
        
        System.out.print("Input an offset: ");
        int offset = input.nextInt();
        
        while (offset > string.length()) {
            System.out.println("The offset is to big, input another one that is smaller than string length");
            offset = input.nextInt();
        }
        
        System.out.println(string.substring(offset, string.length()) + string.substring(0, offset));

    }
}
