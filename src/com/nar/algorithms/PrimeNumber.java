package com.nar.algorithms;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
        System.out.println(isPrime(23));

    }

    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }

        if (num%2 == 0) {
            return false;
        }

        int sqrt = (int)Math.sqrt(num) + 1;
        for (int i = 3; i < sqrt ; i +=2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
