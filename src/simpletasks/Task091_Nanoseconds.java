package simpletasks;

public class Task091_Nanoseconds {
    
    public static void main(String[] args) {
        
        long start = System.nanoTime();
        double sum = 0;
        sum = sum * Math.cos(4.14)+ 2; 
        sum *= Math.pow(12, 5);
        long elapsedTime = System.nanoTime() - start;
        
        System.out.println("It took: " + elapsedTime + " nano seconds to count sum: " + (int) sum);
    }
}
