package com.nar.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {8,4,-3,2,7};
        int[] sorted = sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int leastNoIndex = i;
            for(int j=i+1; j<arr.length; j++ ){
                if(arr[j]<arr[leastNoIndex]){
                    leastNoIndex = j;
                }
            }
            if(i != leastNoIndex){
                swap(arr, i, leastNoIndex);
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
