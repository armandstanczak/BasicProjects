package simpletasks;

import java.util.Arrays;

public class Task078_TestArray {

    public static void main(String[] args) {
        
        int array[] = {5, 7};
        int counter = 0;
        
        for (int i = 0; i <= array.length - 1; i++)
        {
            if (array[i] == 4 || array[i] == 7)
                    {
                        counter++;
                    }
        }
        
        System.out.println(Arrays.toString(array));
        System.out.println(counter > 0);
    }
}
