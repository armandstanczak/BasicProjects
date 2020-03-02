package simpletasks;

import java.util.Arrays;

public class Task128_Median {

    public static void main(String[] args) {
        
        int[] arr = {10, 2, 38, 23, 38, 23, 21};
        System.out.println("Unsorted array is: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array is: " + Arrays.toString(arr));
        System.out.println("Median is: " + median(arr));
    }
    
    public static double median(int[] a) {
        if (a.length % 2 == 0) {
            return ((a[a.length] / 2 - 1) + (a[a.length / 2])) / 2;
        } else {
            return a[a.length / 2];
        }
    }
}
