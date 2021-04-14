package com.nar.algorithms;

public class StockBuySellMaximumProfit {
    //https://www.geeksforgeeks.org/stock-buy-sell/
    public static void main(String[] args) {
        StockBuySellMaximumProfit stockBuySell = new StockBuySellMaximumProfit();
        int[] price = new int[]{100, 180, 260, 310,
                40, 535, 695};
        System.out.println(maximumProfit(price));
    }

    public static int maximumProfit(int[] arr) {
        int maxVal = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] - arr[i]) > maxVal) {
                    maxVal = arr[j] - arr[i];
                }
            }
        }

        return maxVal;
    }




}
