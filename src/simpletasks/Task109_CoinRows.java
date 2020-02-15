package simpletasks;

import java.util.Scanner;

public class Task109_CoinRows {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of coins: ");
        int coins = input.nextInt();
        String coin = "$";
        int row = 1;
        
        while (coins > 0) {
            
            for (int i = 1; i <= row; i++) {
                if (coins == 0) {
                    continue;
                }
                System.out.print(coin);
                coins--;
            }
            System.out.print("\n");
            row++;
        }
    }
}
