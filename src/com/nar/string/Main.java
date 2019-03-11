package com.nar.string;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringOperations stringOperations = new StringOperations();

        //----------Theory is there in separate document

        //---------Substring Example
        // .substring prints till index  : endindex -1
        System.out.println("012345678".substring(0,8));//Will print till 8-1=7th index
        System.out.println("012345678".substring(0,1)); //First character

        //-------Reverse String O(N) complexity
        System.out.println(stringOperations.reverseString("narendra"));

        System.out.println(new StringBuilder("narendra").reverse());

        //----------Suffixes
        List<String> suffixes = stringOperations.getSuffixes("abcde");
        System.out.println("suffixes: "+suffixes);

        //---------Prefixes
        List<String> prefixes = stringOperations.getPrefixes("abcde");
        System.out.println("prefixes: "+prefixes);

        //-----------Longest Common Prefix
        String lonestCommonPrefix = stringOperations.getLongestCommonPrefix("abcde", "abcdefg");
        System.out.println("longestcommonPrefix: "+lonestCommonPrefix);

        //------------Longest Repeating Substring
        String longestRepeatingSubStr = stringOperations.getLongestRepeatedSubstring("hellloabcdehello");
        System.out.println("longestRepeatingSubstr: "+longestRepeatingSubStr);
     }
}
