package com.nar.array.arrayInterviewQuestions;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingNumberInSeries {
    //Series from 1 to n
    int n;
    int[] numberArr;

    public FindMissingNumberInSeries(int n, int[] numberArr) {
        this.n = n;
        this.numberArr = numberArr;
    }

    //-
    public int findMissingNumberNormal(){
        int seriesSum = n *(n+1)/2;
        int sumActual = 0;
        for(int i : numberArr){
            sumActual += i;
        }
        return seriesSum-sumActual;
    }

    public int findMissingNumberUsingXor(){
        //logic is if xor number with same number we get 0
        // (XOR given series) XOR (XOR actual series)
        // (A XOR B XOR C) XOR (B XOR C)
        //    = (A) XOR (B XOR B) XOR (C XOR C)
        //    = A XOR 0 XOR 0
        //    = A (Missing number)

        int x1 = 0;
        int x2 = 0;

        for(int i : numberArr){
            x1 = x1 ^ i;
        }

        for (int j=1 ; j<=n ; j++){
            x2 = x2 ^ j;
        }

        int missingNo = x1 ^ x2;
        return missingNo;

    }

    public void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);// Main line
            System.out.println(++lastMissingIndex);
        }
    }


}
