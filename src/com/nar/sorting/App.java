package com.nar.sorting;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

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
        new ConcurrentHashMap<String, String>();
        new HashMap<String, String>();

        System.out.println("-----------Counting Sort---------------");
        CountingSort countingSort = new CountingSort(nums);
        countingSort.countingSort(3, 6);
        countingSort.showArray();
    }
}
