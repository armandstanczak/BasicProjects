package simpletasks;

import java.util.Arrays;

public class Task077_ThirdArray {

    public static void main(String[] args) {
        
        int array1[] = {50, -20, 0};
        int array2[] = {5, -50, 10};
        
        int array3[] = new int[2];
        
        array3[0] = array1[0];
        array3[1] = array2[array2.length -1];
        
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));
        
    }
    
}
