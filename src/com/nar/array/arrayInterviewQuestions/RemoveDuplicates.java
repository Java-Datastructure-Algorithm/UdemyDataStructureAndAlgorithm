package com.nar.array.arrayInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public int[] removeDuplicates(int[] arr){
        Arrays.sort(arr);
        List<Integer> duplicatesRemove = new ArrayList<>();
        //1 1 1 2 2 3 3 3 4
        for(int i = 0; i < arr.length -1 ; i++){
            if(arr[i+1] != arr[i]){
                duplicatesRemove.add(arr[i]);
            }
        }

        duplicatesRemove.add(arr[arr.length-1]); // Adding last element

        // Converting to array
        int[] removeArr = new int[duplicatesRemove.size()];
        for(int i = 0; i< duplicatesRemove.size() ; i++){
            removeArr[i] = duplicatesRemove.get(i);
        }

        return removeArr;
    }
}
