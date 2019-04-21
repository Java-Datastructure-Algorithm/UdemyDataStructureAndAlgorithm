package com.nar.sorting;

import java.util.Arrays;

public class MergeSort {
    private int[] arr;
    private int[] tempArray;

    public MergeSort(int[] arr) {
        this.arr = arr;
        this.tempArray = new int[arr.length];
    }

    public void sort() {
        mergesort(0, arr.length - 1);
    }

    public void mergesort(int low, int high){
        if(low >= high){
            return;
        }

        int middle = (low + high)/2;
        mergesort(low, middle);
        mergesort(middle+1, high);
        merge(low, middle, high);
    }

    private void merge(int low, int middle, int high){
        for(int i = low; i <= high; i++){
            tempArray[i] = arr[i];
        }

        int i = low;
        int j = middle+1;

        int k = low; // index for undated

        while((i <= middle) && (j <=high)){
            if(tempArray[i] <= tempArray[j]){
                arr[k] = tempArray[i];
                i++;
            }else{
                arr[k] = tempArray[j];
                j++;
            }
            k++;
        }


        // Copy the rest of the left side of the array into the target array
        while(i <= middle){
            arr[k] = tempArray[i];
            k++;
             i++;
        }

        while( j <= high){
            arr[k] = tempArray[j];
            k++;
            j++;
        }


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
