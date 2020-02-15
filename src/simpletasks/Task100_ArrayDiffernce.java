package simpletasks;

import java.util.Arrays;

public class Task100_ArrayDiffernce {

    public static void main(String[] args) {
        
        int a[] = {10, 20 ,30 ,40 ,50 ,60 ,70};
        int b[] = {10, 21, 31, 39, 49, 60, 72};
        
        System.out.println("First array: " + Arrays.toString(a));
        System.out.println("Second array: " + Arrays.toString(b));
        System.out.println("There are " + solution(a, b) + " pairs on numbers that differ by 1");
    }
    
    public static int solution(int a[], int b[]) {
        
        int counter = 0;
        
        for (int i = 0; i <= a.length - 1; i++) {
            if (Math.abs(a[i] - b[i]) == 1) {
                counter++;
            }
        }
        return counter;
    }
}
