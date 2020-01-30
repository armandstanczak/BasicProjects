package simpletasks;

import java.util.Scanner;

public class Task030_HexToOct {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input hex: ");
        String hex = input.nextLine();
        
        int dec = Integer.parseInt(hex, 16);
        String oct = Integer.toOctalString(dec);
        
        System.out.println("Octal is: " + oct);
        
    }
}
