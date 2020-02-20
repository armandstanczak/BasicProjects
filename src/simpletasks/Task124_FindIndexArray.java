package simpletasks;

import java.util.Arrays;

public class Task124_FindIndexArray {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 4, 5, 6};
        int number1 = 5;
        int number2 = 0;
        int number3 = 7;
        
        System.out.println("The number " + number1 + " is located in position " + positionArray(number1, array) + " in array: " + Arrays.toString(array));
        System.out.println("The number " + number2 + " is located in position " + positionArray(number2, array) + " in array: " + Arrays.toString(array));
        System.out.println("The number " + number3 + " is located in position " + positionArray(number3, array) + " in array: " + Arrays.toString(array));
    }
    
    public static int positionArray(int a, int[] array) {
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return i;
            } 
        }
        
        int[] arrayTemp = Arrays.copyOf(array, array.length + 1);
        arrayTemp[arrayTemp.length - 1] = a;
        Arrays.sort(arrayTemp);
        
        for (int j = 0; j < arrayTemp.length; j++) {
            if (arrayTemp[j] == a) {
                return j;
            } 
        }
        return -1;
    }
}
