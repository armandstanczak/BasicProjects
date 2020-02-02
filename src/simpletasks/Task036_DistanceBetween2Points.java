package simpletasks;

import java.util.Scanner;

public class Task036_DistanceBetween2Points {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input the latitude of first coordinate: ");
        double lat1 = input.nextDouble();
        System.out.print("Input the longitude of first coordinate: ");
        double long1 = input.nextDouble();
        System.out.print("Input the latitude of first coordinate: ");
        double lat2 = input.nextDouble();
        System.out.print("Input the latitude of first coordinate: ");
        double long2 = input.nextDouble();
        
        double radius = 6371.01;
        
        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2 = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);
        
        double distance = radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));
        
        System.out.println("The distance between those poins is: " + distance);
        
    }
}