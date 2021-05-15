package com.nar.algorithms;

import java.util.Arrays;

public class StockBuySellMaximumProfit {
    //https://www.geeksforgeeks.org/stock-buy-sell/

    //{100, 180, 260, 310, 40, 535, 695}
    //{0,    1,   2,   3,   4,  5,   6}
    //{40:4, 100:0, 180:1, 260:2, 310:3, 535:5, 695:6}
    //4-6, 0-3,
    public static void main(String[] args) {
        System.out.println(maximumProfit(new int[] {100, 180, 260, 310, 40, 535, 695}));
    }

    public static int maximumProfit(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        return 10;
    }




}
