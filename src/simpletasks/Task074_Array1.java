package simpletasks;

import java.util.Scanner;

public class Task074_Array1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        
        int array[] = {10, -20, 0, 30, 40, 50, 60, 10};
//        int counter = 0;
//        
//        for (int i = 0; i < array.length - 1; i++)
//        {
//            if (array[i] == number)
//            {
//                counter++;
//            }
//        }
//        
//        if (counter > 0)
//        {
//            System.out.println("true");
//        }
//        else
//        {
//            System.out.println("false");
//        }

        System.out.println(array[0] == number || array[array.length - 1] == number);
    }
}
