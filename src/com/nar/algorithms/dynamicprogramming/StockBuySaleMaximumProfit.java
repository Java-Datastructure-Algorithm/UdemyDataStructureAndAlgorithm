package com.nar.algorithms.dynamicprogramming;

import java.util.ArrayList;

public class StockBuySaleMaximumProfit {

    public static void main(String[] args) {
        int price[] = { 100, 180, 260, 310, 40, 535, 695 }; //100-310, 40-695 =865
        System.out.println("Maximum Profit: "+ stockBuySellMaxProfit(price));

    }

    // This function finds the buy sell schedule for maximum profit
    public static int stockBuySellMaxProfit(int price[])
    {
        // Prices must be given for at least two days
        int maxProfit = 0;
        int n = price.length;
        if (n == 1)
            return 0;

        // Traverse through given price array
        int i = 0;
        while (i < n - 1) {
            // Find Local Minima. Note that the limit is (n-2) as we are
            // comparing present element to the next element.
            while ((i < n - 1) && (price[i + 1] <= price[i]))
                i++;

            // If we reached the end, break as no further solution possible
            if (i == n - 1)
                break;
            int minima = price[i];
            i++;

            // Find Local Maxima.  Note that the limit is (n-1) as we are
            // comparing to previous element
            while ((i < n) && (price[i] >= price[i - 1]))
                i++;

            int maxima = price[i - 1];
            maxProfit += maxima - minima;
        }


        return maxProfit;
    }
}
