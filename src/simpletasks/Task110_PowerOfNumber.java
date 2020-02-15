package simpletasks;

import java.util.Scanner;

public class Task110_PowerOfNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = input.nextInt();
        double count = 0;
        int temp = 0;
        
        for (int i = 1;; i++) {
            count = Math.pow(4, i);
            if (count == a) {
                temp++;
                break;
            } else {
                if (count > a) {
                    break;
                }
            }
        }
        
        if (temp > 0) {
            System.out.println("This number is a power of 4");
        } else {
            System.out.println("This number is not a power of 4");
        }
    }
}
