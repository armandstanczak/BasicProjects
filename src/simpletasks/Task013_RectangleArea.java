package simpletasks;

public class Task013_RectangleArea {

    public static void main(String[] args) {
        
        double width = 5.6;
        double height = 8.5;
        
        System.out.println("Test data:\nWidth = " + width + " Height = " + height);
        
        double area = width * height;
        double perimeter = 2 * (width + height);
        
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
        System.out.printf("Permeter is 2 * (%.1f + %.1f) = %.2f \n", width, height, perimeter);
        
    }
    
}
