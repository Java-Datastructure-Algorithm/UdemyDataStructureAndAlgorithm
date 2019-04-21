package com.nar.string.substringsearch;

public class Main {
    public static void main(String[] args) {
        String text = "THIS IS A TEST";
        String pattern = "TEST";

        //------------BruteForce search
        BruteForceSearch bfSearch = new BruteForceSearch();
        System.out.println(bfSearch.searchText(text, pattern));

        //------------BoyerMoore search
        BoyerMoore boyerMoore = new BoyerMoore(text, pattern);
        System.out.println(boyerMoore.search());

        //----------intern method
        String s1 = new String("str1");
        String s2 = s1.intern(); // checks str1 present in string constant pool or not, if not then it store str1 in
        //string constant pool and return reference of that
        String s3 = "str1";
        System.out.println(s1== s2);//false
        System.out.println(s2 == s3);//true


    }
}
