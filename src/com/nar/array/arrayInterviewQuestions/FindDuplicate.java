package com.nar.array.arrayInterviewQuestions;

public class FindDuplicate {

    public void findDuplicate (int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if (arr[Math.abs(arr[i])] > 0) {
                arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
            } else {
                System.out.println("duplicate found "+Math.abs(arr[i]));
            }

        }
    }
}
