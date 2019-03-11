package com.nar.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOperations {

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


}
