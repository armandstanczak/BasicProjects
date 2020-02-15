package simpletasks;

import java.util.Arrays;

public class Task102_ArrayContains {

    public static void main(String[] args) {
        
        int a[] = {20, 20, 20, 40, 50, 60, 70, 80, 90, 20};
        System.out.println("The arrays is: " + Arrays.toString(a));
        
        boolean answer = answer(a);
        
        if (answer == true) {
            System.out.println("The array contains 10's or 30's");
        } else {
            System.out.println("The array doesn't contain 10's or 30's");
        }
    }
    
    public static boolean answer(int a[]) {
        
        int count10 = 0;
        int count30 = 0;
        
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == 10) {
                count10++;
            } else if (a[i] == 30) {
                count30++;
            }
        }
        
        return count10 != 0 || count30 != 0;
    }
}
