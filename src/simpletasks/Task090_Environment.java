package simpletasks;

public class Task090_Environment {

    public static void main(String[] args) {
        
        System.out.println("Environment path is: \n" + System.getenv("PATH"));
        System.out.println("Environment temp is: \n" + System.getenv("TEMP"));
        System.out.println("Environment username is: \n" + System.getenv("USERNAME"));
    }
    
}
