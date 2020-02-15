package simpletasks;

public class Task098_ValueCheckArray {

    public static void main(String[] args) {
        
        //int array[] = {10, 20, 30, 20, 40, 20, 50, 60, 20}; // false
        int array[] = {10, 20, 30, 20, 40, 20, 50, 60}; // true
        //int array[] = {10, 20, 20, 40, 20, 50, 60};
        
        System.out.println("There are three 20's and they are not next to each other: " + solution(array));
    }
    
    public static boolean solution (int a[]) {
        
        int positive = 0;
        int counter = 0;
        
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == 20) {
                counter++;
            }
        }
            
        for (int j = 0; j <= a.length - 2; j++) {
            if (a[j] == 20) {
                counter++;
            }
            if (a[j] == 20 && a[j + 1] == 20) {
                positive++;
            }
        }
        return positive < 1 && counter == 3;
    }
}
