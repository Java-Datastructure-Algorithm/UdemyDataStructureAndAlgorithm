package com.nar.algorithms.dynamicprogramming;

public class UniquePath {

    public static void main(String[] args) {
        //https://www.youtube.com/watch?v=rBAxUTqvlQA
        System.out.println("Unique paths: "+ uniquePaths(2, 2));
    }


    public static int uniquePaths(int m, int n) { // here considered instead of moving robot to star, star move to robot. This ease the problem since we can iterate in increasing order of i and j
        int[][] mem = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++){
                if (i == 0 || j == 0) {
                    mem[i][j] = 1;
                } else {
                    mem[i][j] = mem[i-1][j] + mem[i][j-1];
                }
            }
        }
        return mem[m-1][n-1];
    }

}
