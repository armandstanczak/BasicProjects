package simpletasks;

import java.util.Scanner;

public class Task119_FindInt {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int solution = solution(number, a);
        
        if (solution == 0) {
            System.out.println("The number is not in the array");
        } else {
            System.out.println("The number is located in position " + solution);
        }
    }
    
    public static int solution(int a, int b[]) {
        
        for (int i = 0; i <= b.length - 1; i++) {
            if (b[i] == a) {
                return i + 1;
            }
        }
        return 0;
    }
}
