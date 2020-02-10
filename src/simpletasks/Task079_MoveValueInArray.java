package simpletasks;

import java.util.Arrays;

public class Task079_MoveValueInArray {

    public static void main(String[] args) {
        
        int[] array = {20, 30, 40, 50, 60, 70, 80, 90};
        
        System.out.println("Original array: " + Arrays.toString(array));
    
        int temp = array[0];
    
        for (int i = 0; i < array.length - 1; i++) 
        {
            array[i] = array[i + 1];
        }
    
        array[array.length - 1] = temp;
    
        System.out.println("Rotated array: " + Arrays.toString(array));
    }
}
