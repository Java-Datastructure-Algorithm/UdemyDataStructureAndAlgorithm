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
    }
}
