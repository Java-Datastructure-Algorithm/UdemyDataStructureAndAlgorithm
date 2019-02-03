package com.nar.sorting;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 6,5,4,3 };
        QuickSort quicksort = new QuickSort(nums);
        quicksort.sort();
        quicksort.showArray();
    }
}
