package simpletasks;

import java.util.Arrays;

public class Task080_BiggerValueArray {

    public static void main(String[] args) {
        
        int array[] = {20, 30, 40};
        System.out.println("Original array: " + Arrays.toString(array));
        
        System.out.println("Larger value between first and last element in array is: " + value(array));
        
    }
    
    
    public static int value(int array[])
    {
        return (array[0] > array[array.length - 1]) ? array[0] : array[array.length - 1];
    }
}
