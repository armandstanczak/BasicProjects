package simpletasks;

import java.util.Arrays;

public class Task106_ArrayShift {

    public static void main(String[] args) {
        
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Old array is: " + Arrays.toString(a));
        int b[] = new int[a.length];
        
        for (int i = 0; i <= b.length - 2; i++) {
            b[i] = a[i + 1];
        }
        b[b.length - 1] = a[0];
        
        System.out.println("New Arrays is: " + Arrays.toString(b));
    }
}
