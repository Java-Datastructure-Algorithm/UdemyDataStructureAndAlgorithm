package com.nar.algorithms.dynamicprogramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println("1 Stairs ways: "+ climbStairsWays(1));
        System.out.println("2 Stairs ways: "+ climbStairsWays(2));
        System.out.println("3 Stairs ways: "+ climbStairsWays(3));
        System.out.println("4 Stairs ways: "+ climbStairsWays(4));

    }

    public static int climbStairsWays(int n) {
        if (n <= 1) {
            return 1;
        }

        int ways[] = new int[n+1];
        ways[0] = 1;
        ways[1] = 1;

        for (int i = 2; i <= n; i++) {
            ways[i] = ways[i - 2] + ways[i - 1];
        }
        return ways[n];
    }
}
