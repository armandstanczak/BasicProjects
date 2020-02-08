package simpletasks;

public class Task075_CompareArrayElements {

    public static void main(String[] args) {
        
        int array[] = {10, -20, 0, 30, 40, 60, 10};
        
        System.out.println(array.length >= 2 && array[0] == array[array.length - 1]);
    }
    
}
