package com.nar.algorithms.dynamicprogramming;

import java.util.ArrayList;

public class StockBuySaleMaximumProfitMultipleBuySell {

    public static void main(String[] args) {
        int price[] = { 100, 180, 260, 310, 40, 535, 695 }; //100-310, 40-695 =865
        //Peak valley approach
        System.out.println("Maximum Profit2: "+ maxProfit(price));
        int prices[] = { 7, 1, 5, 3, 6, 4 };

    }

    public static int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])// *** checking is imp i < prices.length - 1
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}
