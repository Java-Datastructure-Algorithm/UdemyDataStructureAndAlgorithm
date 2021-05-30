package com.nar.algorithms.recursion;

import java.util.Arrays;

public class FibonacciSeries {

    public static void main(String[] args) {
        //In mathematics, the Fibonacci numbers are the following sequence of numbers:
        // 0,1,1,2,3,5,8 (starts with 0 not with 1)
        fibonacciIterative(8);//In iterative we can print series but in recursive we can print nth vlaue only

        FibonacciSeries fibo = new FibonacciSeries();
        int fourthFibonacci = fibo.fibonacciRecursive(4);
        System.out.println("nth fibonacci: "+ fourthFibonacci);

        System.out.println("Dynamic 2nd " + fibonacciDynamic(1));

    }

    //Iterative
    public static void fibonacciIterative(int numb){
        int a = -1, b = 1, c=0;
        int[] arr = new int[numb];

        for(int i = 0; i < numb ; i++){
            c = a + b;
            a = b;
            b = c;
            arr[i] = c;
        }

        System.out.println(Arrays.toString(arr));
    }

    //Recursive
    public int fibonacciRecursive(int numb){
        /*if(numb <= 1){ // This will consider first element of fibonacci as 1 not 0, also for this consider 0th fib is 0 1st
            return numb; //Except for first value all other follows sum of previous two
        }*/

        if (numb == 1 || numb == 2) {
            return numb - 1;
        }

        return fibonacciRecursive(numb -1) + fibonacciRecursive(numb -2);
    }

    //Dynamic
    public static int fibonacciDynamic(int num) {
        int[] fibArr = new int[num +1];//To handle extra for 0
        fibArr[0] = 0;
        fibArr[1] = 1;

        for (int i = 2; i <= num; i++) { // ***here <= not < since we are considering 0th =0 and 1st =1
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }
        return fibArr[num];
    }

}
