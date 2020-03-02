package simpletasks;

import java.util.Arrays;

public class Task129_FindInArray {

    public static void main(String[] args) {
        
        int trigger = 0;
        int[] arr = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            trigger ^= arr[i];
        }
        System.out.println(trigger);
    }
}
