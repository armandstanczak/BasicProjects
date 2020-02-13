package simpletasks;

import java.util.Arrays;

public class Task093_ElementNextTo {

    public static void main(String[] args) {
        
        int array1[] = {10, 10, 20, 10, 10, 20};
        //int array2[] = {10, 10, 20, 20, 20};
        int test1 = 0;
        int test2 = 0;
           
        for (int i = 1; i <= array1.length - 2; i++) {
            if (array1[i] == 10 && (array1[i - 1] == 10 || array1[i + 1] == 10)) {
                //System.out.println("There are two number 10 touching! (in array: " + Arrays.toString(array1) + ")");
                test1++;
            }
            if (array1[i] == 20 && (array1[i - 1] == 20 || array1[i + 1] == 20)) {
                //System.out.println("There are two number 20 touching! (in array: " + Arrays.toString(array1) + ")");
                test2++;
            }
        }
          
        if (test1 > 0 && test2 > 0) {
            System.out.println("There are 10's and 20's touching!\nThis is a bad array: " + Arrays.toString(array1));
        } else if (test1 > 0) {
            System.out.println("There are 10's touching!\nThis is an 'OK' array: " + Arrays.toString(array1));
        } else if (test2 > 0) {
            System.out.println("There are 20's touching!\nThis is an 'OK' array: " + Arrays.toString(array1));
        } else {
            System.out.println("This is a clean array: " + Arrays.toString(array1));
        }
    }
}