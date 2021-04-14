package com.nar.algorithms;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //A number is called an Armstrong number if it is equal to the cube of its every digit.
        // For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
        System.out.println(isArmstrongNum(153));
        System.out.println(isArmstrongNum(11));
    }

    public static boolean isArmstrongNum(int num) {
        int sum = 0;
        int numcopy = num;
        while (num > 0) {
            int digit = num%10;
            sum = sum + (digit*digit*digit);
            num = num/10;
        }
        if (numcopy == sum) {
            return true;
        }
        return false;
    }
}
