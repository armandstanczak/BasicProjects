package simpletasks;

public class Task039_3DigitNumbers {

    public static void main(String[] args) {
        
        
        int count = 0;
        for (int a = 1; a <= 4; a++)
        {
            for (int b = 1; b <= 4; b++)
            {
                for (int c = 1; c <= 4; c++)
                {
                    if (a != b && b != c && a != c)
                    {
                        count++;
                        System.out.print(a + "" + b + "" + c + "\n");
                    }
                }
            }
        }
        
        System.out.println("Number of three digit numbers is: " + count);
        
    }
    
}
