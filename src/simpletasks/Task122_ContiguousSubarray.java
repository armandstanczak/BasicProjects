package simpletasks;

public class Task122_ContiguousSubarray {

    public static void main(String[] args) {
        
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        System.out.println("The max subarray is:" + maxSub(array));
    }
    
    private static int maxSub(int[] a) {
        if (a.length < 1) {
            return 0;
        }
        
        int maxNow = 0;
        int maxEnd = 0;
        
        for (int i = 0; i < a.length; i++) {
            maxEnd += a[i];
            if (maxNow < maxEnd) {
                maxNow = maxEnd;
            } 
            if (maxEnd < 0) {
                maxEnd = 0;
            }
        }
        return maxNow;
    }
}
