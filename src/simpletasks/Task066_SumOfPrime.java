package simpletasks;

public class Task066_SumOfPrime {

    public static void main(String[] args) {

        int status = 1;
        int num = 3;
        int sum = 2;
        
        for (int i = 2; i <= 100;) 
        {
            for (int j = 2; j <= Math.sqrt(num); j++) 
            {
                if (num % j == 0) 
                {
                    status = 0;
                    break;
                }
            }
            if (status != 0) 
            {
                sum = sum + num;
                i++;
            }
            status = 1;
            num++;
        }
        
        System.out.println("The sum of the first 100 prime numbers is: " + sum);    
    }
}
