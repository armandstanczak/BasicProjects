package simpletasks;

import java.util.Scanner;

public class Task027_OctalToHex {
    
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        System.out.print("Input octal number: ");
        String octal = input.nextLine();
        
        int decimal = Integer.parseInt(octal, 8);
        String hex = Integer.toHexString(decimal).toUpperCase();
        
        System.out.println("Hex number is: " + hex + "\n");
        
    }
}
