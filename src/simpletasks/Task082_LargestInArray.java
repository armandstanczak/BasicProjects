package simpletasks;

import java.util.Arrays;

public class Task082_LargestInArray {

    public static void main(String[] args) {
        
        int array[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array is: " + Arrays.toString(array));
        
        System.out.println("Largest element between first, middle and last elements is: " + result(array));
    }
    
    public static int result(int array[])
    {
        return Math.max(array[0], Math.max(array[array.length / 2], array[array.length - 1]));
    }
}
