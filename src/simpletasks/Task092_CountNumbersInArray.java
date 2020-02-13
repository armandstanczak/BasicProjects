package simpletasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task092_CountNumbersInArray {
    
    public static void main(String[] args) {
        
        int array[] = new int[10];
        Scanner input = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Input " + (i + 1) + " number: ");
            array[i] = input.nextInt();
        }
        
        for (int j = 0; j <= array.length - 1; j++) {
            if (array[j] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        System.out.println("Original array is: " + Arrays.toString(array));
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
        
        
    }
}
