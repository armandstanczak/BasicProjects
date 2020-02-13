package simpletasks;

public class Task096_CheckArray {

    public static void main(String[] args) {
        
        int array[] = {1, 2, 3, 4, 20, 10, 6, 7, 8, 9, 11, 12, 15, 18, 50};
        
        System.out.println("The array is: " + arrayCheck(array));
    }
    
    public static String arrayCheck(int array[]) {
        
        int counter = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == 10) {
                for (int j = i; j <= array.length - 1; j++) {
                    if (array[j] == 20) {
                        counter++;
                    }
                }
            }
        }
        
        if (counter == 0) {
            return "OK";
        } else {
            return "not OK";
        } 
    }
}
