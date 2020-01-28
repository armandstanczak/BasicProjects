package simpletasks;

import java.util.Scanner;

public class Task020_DecimalToHex {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        int number = input.nextInt();
        
        int i=1;
        int reminder;
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexNo = "";
        
        while (number != 0)
        {
            reminder = number % 16;
            hexNo += hex[reminder];
            number /= 16;
        }
        System.out.println("Decimal to hexadecimal is: " + hexNo);
    }
    
}
