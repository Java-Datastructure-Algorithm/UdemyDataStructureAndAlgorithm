package com.nar.sorting;

public class CountingSort {
    private int[] arr;

    public CountingSort(int[] arr) {
        this.arr = arr;
    }

    public void countingSort(int min, int max){
        int[] countArray= new int[max - min + 1];

        for(int i: arr){
            countArray[i-min]++;
        }

        int z = 0;

        for(int i=min; i<=max; i++){
            while(countArray[i-min]>0){
                this.arr[z] = i;
                z++;
                countArray[i-min]--;
            }
        }
    }

    public void showArray(){
        for(int i=0;i<this.arr.length;++i){
            System.out.print(arr[i]+"  ");
        }
    }
}
