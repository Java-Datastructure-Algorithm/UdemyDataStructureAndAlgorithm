package com.nar.array.arrayInterviewQuestions;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArryInterviewRunner {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        System.out.println("----------Reverse Array--------");
        int[] reversed = new ReverseArray().reverseArray(arr);
        System.out.println("Reversed array :"+Arrays.toString(reversed));

        // Using org.apache.commons.lang.ArrayUtils.reverse() method

        System.out.println("---------Anagram------------");
        boolean isAnagram = new Anagram().isAnagram("abcde" , "edcba");
        System.out.println("isAnagram: "+isAnagram);

        //------Find duplicate using absolute
            //Note: integer value in array are smaller than the length of array
        int[] arr2 = new int[]{1,2,3,4,2,3};
        new FindDuplicate().findDuplicate(arr2);

        System.out.println("------Find Missing number in series------");
        FindMissingNumberInSeries fms = new FindMissingNumberInSeries(6, new int[]{1,2,3,4,6});
        System.out.println(fms.findMissingNumberNormal());
        System.out.println(fms.findMissingNumberUsingXor());

        fms.printMissingNumber(new int[]{1,2,3,4,7}, 7);

        System.out.println("------Removing Duplicates------");
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] arrWithDuplicates = {1,2,3,1,2,3,1,2,3,4};
        int[] removedDuplicateArr = rd.removeDuplicates(arrWithDuplicates);
        System.out.println(Arrays.toString(removedDuplicateArr));
    }

}
