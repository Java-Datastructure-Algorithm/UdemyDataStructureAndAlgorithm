package com.nar.array.arrayInterviewQuestions;

import java.util.Arrays;

public class Anagram {

    //Eg Listen and Silent
    public boolean isAnagram(String str1 , String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if(arr1.length != arr2.length){
            return false;
        }
        // O(NlogN) running time
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //running time is O(N)
        //O(NlogN)+O(N) = O(NlogN)
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;

    }
}
