package simpletasks;

import java.util.Scanner;

public class Task023_BinToHex {

    public static void main(String[] args) {
        
        int i = 1;
        int reminder;
        int decimal = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input binary number: ");
        int binaryNo = in.nextInt();
  
        while (binaryNo != 0) {
            reminder = binaryNo % 2;
            decimal += reminder * i;
            i = i * 2;
            binaryNo /= 10;
        }
        
        String temp = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal value is: " + temp);
        
    }
}
