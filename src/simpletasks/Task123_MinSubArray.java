package simpletasks;

public class Task123_MinSubArray {

    public static void main(String[] args) {
        
        int[] array = {-20, -2, 1, -3, 4};
        
        System.out.println("The min subarray is:" + minSub(array));
    }
    
    private static int minSub(int[] a) {
        if (a.length < 1) {
            return 0;
        }
        
        int minNow = 0;
        int minEnd = 0;
        
        for (int i = 0; i < a.length; i++) {
            minEnd += a[i];
            if (minNow > minEnd) {
                minNow = minEnd;
            } 
            if (minEnd > 0) {
                minEnd = 0;
            }
        }
        return minNow;
    }
}
