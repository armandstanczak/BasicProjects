package simpletasks;

import java.util.Arrays;

public class Task107_AdjacentElements {

    public static void main(String[] args) {
        
        int a[] = {1, 2, 3, 6, 8, 0};
        System.out.println("Original array is: " + Arrays.toString(a));
        
        boolean answer = false;
        
        for (int i = 0; i < a.length - 3; i++) {
            if (a[i] + 1 == a[i + 1] && a[i + 1] + 1 == a[i + 2]) {
                answer = true;
            }
        }
        
        if (answer == true) {
            System.out.println("There are three increasing numbers next to eachother");
        } else {
            System.out.println("There aren't three increasing numbers next to eachother");
        }
        
    }
    
}
