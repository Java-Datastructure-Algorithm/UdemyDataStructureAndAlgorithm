package com.nar.algorithms.dynamicprogramming;

public class CoinChangeMinimumNo {
    // Driver program
    public static void main(String[] args) {
        int coins[] = {9, 6, 5, 1};
        int amount = 11;
        System.out.println("Minimum coins required is "
                + minCoins(coins, amount));
    }

    // m is size of coins array
    // (number of different coins)
    static int minCoins(int coins[], int amount) {
        // table[i] will be storing
        // the minimum number of coins
        // required for i value. So
        // table[V] will have result
        int table[] = new int[amount + 1];

        // Base case (If given value V is 0)
        table[0] = 0;

        // Initialize all table values as Infinite
        for (int i = 1; i <= amount; i++)
            table[i] = Integer.MAX_VALUE;

        // Compute minimum coins required for all
        // values from 1 to V
        for (int i = 1; i <= amount; i++) {
            // Go through all coins smaller than i
            for (int j = 0; j < coins.length; j++)
                if (coins[j] <= i) {
                    int remaining = i - coins[j];
                    int minCountForRemaining = table[remaining];
                    if (minCountForRemaining != Integer.MAX_VALUE
                            && minCountForRemaining + 1 < table[i]) {
                        table[i] = minCountForRemaining + 1;
                    }
                }

        }

        if (table[amount] == Integer.MAX_VALUE)
            return -1;

        return table[amount];
    }
}
