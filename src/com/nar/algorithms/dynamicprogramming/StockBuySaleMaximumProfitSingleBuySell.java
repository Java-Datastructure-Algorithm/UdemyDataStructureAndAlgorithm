package com.nar.algorithms.dynamicprogramming;

public class StockBuySaleMaximumProfitSingleBuySell {
    public static void main(String[] args) {
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println("Maximum Profit: "+ maxProfit(price));
        int prices[] = { 7, 1, 5, 3, 6, 4 };//1-5, 3-6 = 7
        System.out.println("Maximum Profit: "+ maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
}
