package com.nar.sorting;

import java.util.Arrays;

public class QuickSort {

    private int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        quicksort(0, arr.length - 1);
    }

    public void quicksort(int low, int high){
        if(low >= high){//base condition, since this is recursive , do till there is only one item in the array
            return;
        }
        int pivotIndex = partition(low, high);//this method will place one number to its sorted position where all
        quicksort(low, pivotIndex-1);//Elements lower than this will fall in lower array and greater in other array
        quicksort(pivotIndex+1, high);
    }

    private int partition(int low, int high){
        int pivot = arr[high];
        int pivotIndex = low;
        // At the end we need to bring pivotIndex to a correct position where pivot can be stored

        for(int i=low; i<= high-1; i++){
            //high-1 since high is pivot
            if(arr[i] <= pivot){
                swap(pivotIndex, i);
                pivotIndex++;
            }
        }
        swap(pivotIndex, high);
        return pivotIndex;
    }

    private int[] swap( int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public void showArray(){
        System.out.println(Arrays.toString(arr));
    }
}
