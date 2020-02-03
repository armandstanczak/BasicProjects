package simpletasks;

import java.util.Scanner;

public class Task055_SecondsToHours {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number you want to conver: ");
        int time = input.nextInt(); //100
        
        int sec = time % 60; // 40
        int minutes = time / 60; // 1
        int hours = minutes / 60;
        minutes = minutes - hours * 60;
        
        System.out.println(hours + " : " + minutes + " : " + sec);
    }
}
