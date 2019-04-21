package com.nar.string;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringOperations stringOperations = new StringOperations();

        //----------Theory is there in separate document

        System.out.println("-----------Anargam Check------------");
        System.out.println("is Anargam :"+stringOperations.isAnagram("SILENT", "LISTEN"));

        System.out.println("---------Substring Example----------");
        // .substring prints till index  : endindex -1
        System.out.println("012345678".substring(0,8));//Will print till 8-1=7th index
        System.out.println("012345678".substring(0,1)); //First character

        System.out.println("-------Reverse String O(N) complexity---------");
        System.out.println("Using StringBuilder Append: "+stringOperations.reverseString("narendra"));
        System.out.println("Using recursive function: "+stringOperations.reverseStringRecursively("narendra"));
        //There is no inplace reverse method since there is no setCharAt method


        System.out.println("using StringBuilder reverse method:"+new StringBuilder("narendra").reverse());

        System.out.println("----------Suffixes----------");
        List<String> suffixes = stringOperations.getSuffixes("abcde");
        System.out.println("suffixes: "+suffixes);

        System.out.println("---------Prefixes----------");
        List<String> prefixes = stringOperations.getPrefixes("abcde");
        System.out.println("prefixes: "+prefixes);

        System.out.println("-----------Longest Common Prefix----------");
        String lonestCommonPrefix = stringOperations.getLongestCommonPrefix("abcde", "abcdefg");
        System.out.println("longestcommonPrefix: "+lonestCommonPrefix);

        System.out.println("----------Longest Repeating Substring-----");
        String longestRepeatingSubStr = stringOperations.getLongestRepeatedSubstring("ssshellloabcdehellouu");
        System.out.println("longestRepeatingSubstr: "+longestRepeatingSubStr);

        System.out.println("-----------Check String contains only digit-------");
        System.out.println("1234 isStrinContainsOnlyDigit: "+stringOperations.isContainOnlyDigits("1234"));
        System.out.println("1234a isStrinContainsOnlyDigit: "+stringOperations.isContainOnlyDigits("1234a"));

        System.out.println("-----------Check String contains only specified no of digits-------");
        System.out.println("123456 isStrinContainsOnly6Digit: "+stringOperations.isContainingSpecifiedDigits("123456", 6));
        System.out.println("1234567 isStrinContainsOnly6Digit: "+stringOperations.isContainingSpecifiedDigits("1234567", 6));
        System.out.println("12345ab isStrinContainsOnly6Digit: "+stringOperations.isContainingSpecifiedDigits("12345ab", 6));

        System.out.println("--------Check String Rotation-----------");
        System.out.println(stringOperations.isRotationString("INDIAUSAJAPAN", "USAJAPANINDIA"));

     }
}
