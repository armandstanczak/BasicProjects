package simpletasks;

import java.util.Arrays;

public class Task113_ArraySort {

    public static void main(String[] args) {
        
        int a[] = {11, 1, 2, 3, 4};
        int b[] = {2, 5, 7, 9};
        
        System.out.println("The first array is " + Arrays.toString(a) + " and the second is " + Arrays.toString(b));
        
        int len1 = a.length;
        int len2 = b.length;
        
        int c[] = new int[len1 + len2];
        
        for(int i = 0; i <= len1 - 1; i++) {
            c[i] = a[i];
        }
        
        for (int j = 0; j <= len2 - 1; j++) {
            c[j + len1] = b[j];
        }
        
        System.out.println("New array before sorting is: " + Arrays.toString(c));
                
        Arrays.sort(c);
        
        System.out.println("The array after sorting is: " + Arrays.toString(c));
    }
    
}
