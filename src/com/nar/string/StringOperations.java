package com.nar.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class StringOperations {

    //------------Anargam check
    // Anargam LISTEN - SILENT, TRIANGLE - INTEGRAL
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

    //-----------Reverse String
    public String reverseString(String text){
        //O(N) using StringBuilder //O(N2) using String
        int textlength = text.length(); // O(1)
        StringBuilder sb = new StringBuilder();
        for(int i = textlength-1 ; i >= 0; i--){ // O(N)
            sb.append(text.charAt(i));  // O(1)    => O(N) + O(1) = O(N)
        }
        return sb.toString();
    }

    public String reverseStringRecursively(String text){
        if(text.length() == 1){//or <2
            return text;
        }

        return (reverseStringRecursively(text.substring(1)) + text.charAt(0));
    }

    //----------Suffixes
    public List<String> getSuffixes(String text){
        int textlength = text.length(); //O(1)

        List<String> suffixList = new ArrayList<>();

        for(int i = 0; i<textlength; i++){
            suffixList.add(text.substring(i)); // O(1)
            // .substring prints till index  : endindex -1
            //can use text.substring(i, textlength) since it will print till textlength-1
        }
        return  suffixList;
    }

    //-----------Prefixes
    public List<String> getPrefixes(String text){
        int textlength = text.length(); //O(1)

        List<String> prefixList = new ArrayList<>();

        for(int i = 1; i<=textlength; i++){
            prefixList.add(text.substring(0,i)); // O(1)
        }
        return  prefixList;
    }

    //-----------Longest Common Prefix
    public String getLongestCommonPrefix(String str1, String str2){
        int commonlenght = Math.min(str1.length(), str2.length());

        for(int i=0; i<commonlenght; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return str1.substring(0, i); // here not i+1 its i only since we need to print till previous iteration
            }
        }

        return str1.substring(0, commonlenght);
    }

    //--------------Longest Repeated Substring------
    public String getLongestRepeatedSubstring(String text){
        int textLength = text.length();
        List<String> suffixes = getSuffixes(text);
        Collections.sort(suffixes);

        String longestSubstring = "";
        for(int i=0; i < textLength-1 ; i++){
            String tempString = getLongestCommonPrefix(suffixes.get(i), suffixes.get(i+1));

            if(tempString.length() > longestSubstring.length()){
                longestSubstring = tempString;
            }
        }

        return longestSubstring;
    }

    public boolean isContainOnlyDigits(String text){
        /*The Java Pattern class can be used in two ways. You can use the Pattern.matches()
        method to quickly check if a text (String) matches a given regular expression.
        Or you can compile a Pattern instance using Pattern.compile() which can be used multiple
        times to match the regular expression against multiple texts.
        Both the Pattern.matches() and Pattern.compile() methods are covered below.*/


        Pattern pattern = Pattern.compile(".*[^0-9].*");
        //Pattern pattern = Pattern.compile(".*\\D.*");
        return !pattern.matcher(text).matches(); // Here notice ! operator
    }

    public boolean isContainingSpecifiedDigits(String text, int noOfDigits){
        Pattern digitPattern = Pattern.compile("\\d{"+noOfDigits+"}");
        return digitPattern.matcher(text).matches();
    }

    public boolean isRotationString (String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        String concatenated = str1 + str1;

        if(concatenated.indexOf(str2) != -1){
            return true;
        }

        return false;
    }

}
