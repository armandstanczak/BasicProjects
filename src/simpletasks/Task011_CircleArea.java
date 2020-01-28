package simpletasks;

public class Task011_CircleArea {

    public static void main(String[] args) {
        
        double rad = 7.5;
        System.out.println("Test data:\nRadius = " + rad);
        
        double perimiter = 2 * Math.PI * rad;
        double area = Math.PI * Math.pow(rad, 2);
        
        System.out.println("Perimiter is: " + perimiter);
        System.out.println("Area is: " + area);
        
    }
    
}
