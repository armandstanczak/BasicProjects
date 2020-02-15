package simpletasks;

import java.util.Arrays;

public class Task104_NewArray {

    public static void main(String[] args) {
        
        int a[] = {10, 20, 10, 20, 30, 40, 50, 10, 2, 3, 4, 5};
        //int a[] = {10, 10, 2};
        System.out.println("Original array: " + Arrays.toString(a));
        
        int b[] = new int[maximum(a)];
        
        for (int i = 0; i <= b.length - 1; i++) {
            b[i] = a[i];
        }
        
        System.out.println("New array is: " + Arrays.toString(b));
    }
    
    public static int maximum(int a[]) {
        
        int last = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == 10) {
                last = i;
            }
        }
        return last;
    }
}
