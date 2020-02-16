package simpletasks;

import java.util.Scanner;

public class Task120_2DimArray {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to look for: ");
        int number = input.nextInt();
        
        int a[][] = new int[10][10];
        int temp = 1;
        int counter = 0;
        int row = 0;
        int column = 0;
        
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                a[i][j] = temp++;
            }
        }
        
        for (int k = 0; k <= 9; k++) {
            for (int l = 0; l <= 9; l++) {
                if (a[k][l] == number) {
                    counter++;
                    row = k + 1;
                    column = l + 1;
                }
            }
        }
        
        if (counter == 0) {
            System.out.println("The number does not apear in the array");
        } else {
            System.out.println("The number appears in the array at position\n" + "Row: " + row + "\nColumn: " + column);
        }
    }
}
