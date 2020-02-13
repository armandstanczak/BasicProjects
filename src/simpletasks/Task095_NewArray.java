package simpletasks;

import java.util.Arrays;

public class Task095_NewArray {

    public static void main(String[] args) {
        
        int a = 10;
        String array[] = new String[a];
        
        for (int i = 0; i < a; i++) {
            array[i] = String.valueOf(i);
        }
        
        System.out.println("New array is: " + Arrays.toString(array));
    }
}
