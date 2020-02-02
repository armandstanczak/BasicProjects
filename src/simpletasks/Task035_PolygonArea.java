package simpletasks;

import java.util.Scanner;

public class Task035_PolygonArea {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides of a polygon: ");
        int numberSides = input.nextInt();
        System.out.print("Input the length of the side: ");
        int sideLength = input.nextInt();
        
        double polygonArea = (numberSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberSides));
        
        System.out.println("the area is: " + polygonArea);
    }
}
