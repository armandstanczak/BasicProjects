package simpletasks;

import java.util.Arrays;

public class Task103_NewArray {

    public static void main(String[] args) {
        
        int a[] = {10, 10, 5, 11, 10, 20, 45, 45, 4, 5, 6, 101, 2};
        //int a[] = {10, 10, 10, 2, 2, 2};
        
        System.out.println("Old array: " + Arrays.toString(a));
        
        int start = solution(a) + 1;
        int b[] = new int[a.length - start];
        
        for (int i = 0; i <= b.length - 1; i++) {
            b[i] = a[i + start];
        }
        
        System.out.println("New array is: " + Arrays.toString(b));
    }
    
    public static int solution(int a[]) {
        
        int max = 0;
        
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == 10) {
                max = i;
            }
        }
        return max;
    }
}
