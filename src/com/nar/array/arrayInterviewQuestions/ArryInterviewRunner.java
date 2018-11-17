package com.nar.array.arrayInterviewQuestions;

import java.util.Arrays;

public class ArryInterviewRunner {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        //----------Reverse Array
        int[] reversed = new ReverseArray().reverseArray(arr);
        System.out.println("Reversed array :"+Arrays.toString(reversed));

        //---------Anagram
        boolean isAnagram = new Anagram().isAnagram("abcde" , "edcba");
        System.out.println("isAnagram: "+isAnagram);

        //------Find duplicate using absolute
            //Note: integer value in array are smaller than the length of array
        int[] arr2 = new int[]{1,2,3,4,2,3};
        new FindDuplicate().findDuplicate(arr2);
    }

}
