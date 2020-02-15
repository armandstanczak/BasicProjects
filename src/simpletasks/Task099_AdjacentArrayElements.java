package simpletasks;

public class Task099_AdjacentArrayElements {

    public static void main(String[] args) {
        
        int array[] = {10, 20, 20, 10, 30, 10 ,60};
        int number = 10;
        
        System.out.println("The ten's are in every pair of numbers: " + solution(array, number));
    }
    
    public static boolean solution(int a[], int b) {
        
        int counter = 0;
        
        for (int i = 0; i <= a.length - 2; i++) {
            if (a[i] != b && a[i + 1] != b) {
                counter = 0;
                break;
            } else {
                counter++; 
            }
        }
        return counter > 0;
    }
}
