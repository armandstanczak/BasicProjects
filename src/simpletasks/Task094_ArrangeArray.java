package simpletasks;

import java.util.Arrays;

public class Task094_ArrangeArray {

    public static void main(String[] args) {
        
        int original[] = {12, 13, 14, 15, 16, 17, 18, 19, 10};
        int odd[] = new int[original.length];
        int even[] = new int[original.length];
        int counterOdd = 0;
        int counterEven = 0;
        int counterOriginal = 0;
        
        System.out.println("Original array looks like this: " + Arrays.toString(original));
        
        for (int i = 0; i <= original.length - 1; i++) {
            if (original[i] % 2 == 0) {
                even[counterEven] = original[i];
                counterEven++;
            } else {
                odd[counterOdd] = original[i];
                counterOdd++;
            }
        }
     
        for (int i = 0; i <= counterOdd - 1; i++) {
            if (odd[i] != 0) {
                original[counterOriginal] = odd[i];
                counterOriginal++;
            }
        }
        
        for (int j = 0; j <= counterEven - 1; j++) {
            if (even[j] != 0) {
                original[counterOriginal] = even[j];
                counterOriginal++;
            }
        }
        
        System.out.println("New array looks something like this: " + Arrays.toString(original));
    }
}
