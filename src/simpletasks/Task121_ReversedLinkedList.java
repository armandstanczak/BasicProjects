package simpletasks;

import java.util.*;

public class Task121_ReversedLinkedList {
    
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(80);
        
        System.out.println("The orginal list is: " + list);
        Collections.reverse(list);
        System.out.println("Reversed list is: " + list);
    }
}
