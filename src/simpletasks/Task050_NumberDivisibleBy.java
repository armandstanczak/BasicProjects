package simpletasks;

public class Task050_NumberDivisibleBy {
    
    public static void main(String[] args) {
        
        int by3[] = new int[100];
        int by5[] = new int[100];
        int by35[] = new int[100];
        int counter3 = 0;
        int counter5 = 0;
        int counter35 = 0;
        
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0)
            {
                by3[counter3] = i;
                counter3++;
            }
            if (i % 5 == 0)
            {
                by5[counter5] = i;
                counter5++;
            }
            if (i % 3 == 0 && i % 5 == 0)
            {
                by35[counter35] = i;
                counter35++;
            }
        }
        
        System.out.println("Numbers divisible by 3: ");
        for (int x = 0; x <= by3.length - 1; x++)
        {
            if (by3[x] != 0)
            {
                System.out.print(by3[x] + ", ");
            }
        }
        
        System.out.println("\n\nNumbers divisible by 5: ");
        for (int x = 0; x <= by5.length - 1; x++)
        {
            if (by5[x] != 0)
            {
                System.out.print(by5[x] + ", ");
            }
        }
        
        System.out.println("\n\nNumbers divisible by 3 and 5: ");
        for (int x = 0; x <= by35.length - 1; x++)
        {
            if (by35[x] != 0)
            {
                System.out.print(by35[x] + ", ");
            }
        }
    }
}
