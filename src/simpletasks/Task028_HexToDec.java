package simpletasks;

import java.util.Scanner;

public class Task028_HexToDec {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input hex  number: ");
        String hex = input.nextLine();
        
        int decimal = Integer.parseInt(hex, 16);
        
        System.out.println("Decimal is: " + decimal);
        
    }
    
}
