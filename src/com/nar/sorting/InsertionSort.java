package com.nar.sorting;

import java.util.Arrays;

public class InsertionSort {
    //Like bubble sort, in bubble sort we compare adjecent items but
    //In this we swap to the left untill it finds its sorted position
    public static void main(String[] args) {
        int[] arr = {8,4,-3,2,7};
        int[] sorted = sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] sort(int[] arr){
        for(int i = 1; i < arr.length-1; i++){
            int j = i;
            while(j>0 && (arr[j-1] > arr[j])){
                swap(arr, j-1, j);
                j--;
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
