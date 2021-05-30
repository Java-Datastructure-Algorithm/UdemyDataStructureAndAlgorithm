package com.nar.algorithms;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        //The happy number can be defined as a number which will yield 1 when it is replaced by the sum of the square of its digits repeatedly.
        // If this process results in an endless cycle of numbers containing 4, then the number is called an unhappy number.

        System.out.println("7 is happy number: "+isHappyNumber(7));
        System.out.println("19 is happy number: "+isHappyNumber(19));
        System.out.println("17 is happy number: "+isHappyNumber(17));
        System.out.println("16 is happy number: "+isHappyNumber(16));
        System.out.println("13 is happy number: "+isHappyNumber(13));

    }

    public static boolean isHappyNumber(int number){
        Set<Integer> numberSet = new HashSet<>();
        //two condition in sum = 1 - is happy
        //if number containded inside hash

        while(numberSet.add(number)){//Set add return true/false , false if already added and cant be added
            number = getSquaredNumber(number);
            if(number == 1){
                return true;
            }
        }
        return false;
    }

    public static int getSquaredNumber(int number){
        int sum = 0;

        while(number !=0){
            int digit = number%10;
            sum += digit*digit;
            number = number/10;
        }

        return sum;
    }
}
