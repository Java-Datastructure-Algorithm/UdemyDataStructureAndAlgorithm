package com.nar.algorithms.dynamicprogramming;

public class JumpGame {
    public static void main(String[] args) {
        int[] jump = new int[]{3,2,1,1,4};
        System.out.println(canJump(jump));
    }


    public static boolean canJump(int[] jump) {
        int maxreachindex = 0;
        for (int i=0; i<jump.length-1; i++) { // ** length -1 since we have to reach at last index so it will not be included
            maxreachindex = Math.max(maxreachindex , i + jump[i]);
        }
        if (maxreachindex < (jump.length-1)) {
            return false;
        }
        return true;

    }
}
