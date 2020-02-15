package simpletasks;

import java.util.Arrays;

public class Task101_CountElementsArray {

    public static void main(String[] args) {
        
        int a[] = {10, 10, 10, 20, 20, 20, 20, 10, 10};
        
        System.out.println("The array is: " + Arrays.toString(a));
        System.out.println("Are there more 10's than 20's in this array: " + solution(a));
    }
    
    public static boolean solution(int a[]) {
        
        int count10 = 0;
        int count20 = 0;
        
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == 10){
                count10++;
            } else if (a[i] == 20) {
                count20++;
            }
        }
        return count10 > count20;
    }
}
