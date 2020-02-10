package simpletasks;

import java.util.Arrays;

public class Task081_NewArray {

    public static void main(String[] args) {
        
        int array[] = {20, 30 ,40, 50 ,60};
        int temp;
        
        System.out.println("Original array: " + Arrays.toString(array));
                
        temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        
        System.out.println("New array after swapping first and last element is: " + Arrays.toString(array));
    }
}
