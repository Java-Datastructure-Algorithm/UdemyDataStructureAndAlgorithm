package com.nar.algorithms.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class HouseRobber {

    public static void main(String[] args) {
        int[] houses = {1,2,3,1};
        System.out.println("Max rob amount :"+rob(houses));
        houses = new int[]{2,7,9,3,1};
        System.out.println("Max rob amount :"+rob(houses));
        List<String> list = new ArrayList<>();
        list.forEach(System.out::println);
    }

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i]+ dp[i-2], dp[i-1]);
        }
        return dp[nums.length - 1];
    }
}
