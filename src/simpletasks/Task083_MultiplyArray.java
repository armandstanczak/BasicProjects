package simpletasks;

import java.util.Arrays;

public class Task083_MultiplyArray {

    public static void main(String[] args) {
        
        int array1[] = {1, 3, -5, 4};
        System.out.println("Array1: " + Arrays.toString(array1));
        
        int array2[] = {1, 4, -5, 2};
        System.out.println("Array2: " + Arrays.toString(array2));
        
        int array3[] = new int[array1.length];
        
        for (int i = 0; i <= array1.length - 1; i++)
        {
            array3[i] = array1[i] * array2[i];
        }
        
        System.out.println("Multiplied elements of both arrays: " + Arrays.toString(array3));
    }
}
