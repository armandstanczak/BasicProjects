package simpletasks;

import java.util.Scanner;

public class Task097_ArrayContains {

    public static void main(String[] args) {
        
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        int first = input.nextInt();
        System.out.print("Input another: ");
        int second = input.nextInt();
        
        System.out.println("The array has those numbers next to each other: " + sideSide(array, first, second));
        System.out.println("The array has those number separated by one element: " + separated(array, first, second));
    }
    
    public static boolean sideSide(int a[], int b, int c) {
        
        int positive = 0;
        for (int i = 1; i <= a.length - 2; i++) {
            if (a[i] == b && (a[i + 1] == c || a[i - 1] == c)) {
                positive++;
            } else if (a[i] == c && (a[i + 1] == b || a[i - 1] == b)) {
                positive++;
            }
        }
        return positive >= 1;
    }
    
    public static boolean separated(int a[], int b, int c) {
        
        int positive = 0;
        for (int i = 0; i <= a.length - 2; i++) {
            if (a[i] == b && a[i + 2] == c) {
                positive++;
            } else if (a[i] == c && a[i + 2] == b) {
                positive++;
            }
        }
        return positive >= 1;
    }
    
}
