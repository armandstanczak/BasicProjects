package simpletasks;

import java.util.Scanner;

public class Task034_AreaOfHexagon {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a hexagon's side: ");
        int sideLen = input.nextInt();
        
        System.out.println("The area of the hexagon is: " + hexArea(sideLen));
    }
    
    public static double hexArea(int a)
    {
        return ( 6 * Math.pow(a, 2)) / ( 4 * Math.tan(Math.PI / 6));
    }
}
