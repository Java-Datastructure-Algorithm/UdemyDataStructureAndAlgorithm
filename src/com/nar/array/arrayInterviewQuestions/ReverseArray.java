package com.nar.array.arrayInterviewQuestions;

public class ReverseArray {

    //In Place alorithm no need of extra memory
    // Other options: Collections.reverse(list) or ArrayUtils.reverse() of apache commons-lang3

    public int[] reverseArray(int[] arr) {
        //logic: put startIndex and endIndex and swap them

        int startIndex = 0;
        int endIndex = arr.length-1;

        while(startIndex < endIndex) {
            swap(arr, startIndex, endIndex);

            startIndex++;
            endIndex--;
        }
        return arr;

    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
