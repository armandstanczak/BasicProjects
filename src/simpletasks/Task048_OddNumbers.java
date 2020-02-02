package simpletasks;

public class Task048_OddNumbers {

    public static void main(String[] args) {
        
        int sum = 0;
        for (int i = 1; i <= 99; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
                sum += i;
            }
        }
        
        System.out.println("Sum of those numbers is: " + sum);
    }
    
}
