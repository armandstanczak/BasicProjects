package simpletasks;

import java.util.Scanner;

public class Task056_CountIntegers {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input minimal number: ");
        int a = input.nextInt();
        System.out.print("Input maximal number: ");
        int b = input.nextInt();
        System.out.print("Divisible by: ");
        int c = input.nextInt();
        
        System.out.println("Number of integers withing the range between " + a + " and " + b + " divisible by " + c + " is: " + count(a, b, c));
    }
    
    public static int count(int x, int y, int z)
    {
        int counter = 0;
        for (int a = x; a <= y; a++)
        {
            if (a % z == 0)
            {
                counter++;
            }
        }
        return counter;
    }
}
