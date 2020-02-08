package simpletasks;

import java.util.Scanner;

public class Task072_ThreeLetterString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.nextLine().trim();
        
//        if (string.length() < 1)
//        {
//            System.out.println("###");
//        }
//        else if (string.length() < 2)
//        {
//            System.out.println(string + "##");
//        }
//        else if (string.length() < 3)
//        {
//            System.out.println(string + "#");
//        }
//        else
//        {
//            System.out.println(string);
//        }

        String added = "###";
        string += added;
        
        System.out.println(string.substring(0, 3));
    }
}
