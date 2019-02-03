package com.nar.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {8,4,-3,2,7};
        int[] sorted = sort(arr);
        System.out.println(Arrays.toString(arr));
    }



    public static int[] sort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }

        return arr;
    }


    private static int[] swap( int[] arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
