package com.nar.sorting;

public class App {
    public static void main(String[] args) {
        System.out.println("------------Quick Sort----------------");
        int[] nums = { 6,5,4,3 };
        QuickSort quicksort = new QuickSort(nums);
        quicksort.sort();
        quicksort.showArray();

        System.out.println("------------Merge Sort----------------");
        MergeSort mergesort = new MergeSort(nums);
        quicksort.sort();
        quicksort.showArray();
    }
}
