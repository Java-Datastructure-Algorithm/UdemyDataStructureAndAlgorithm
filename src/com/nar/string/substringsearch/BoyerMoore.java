package com.nar.string.substringsearch;

import java.util.HashMap;
import java.util.Map;

public class BoyerMoore {
    private String text;
    private String pattern;
    private Map<Character, Integer> mismatchShiftTable;

    public BoyerMoore(String text, String pattern) {
        this.text = text;
        this.pattern = pattern;
        mismatchShiftTable = new HashMap<>();
    }

    private void precomputeShifts() {//Creating badmatch table and each character will shitf
        int patternLength = pattern.length();
        for(int i=0; i< patternLength ; i++){
            char actualCharacter = this.pattern.charAt(i);
            int maxShift = Math.max(1, patternLength - i -1);// Formula
            mismatchShiftTable.put(pattern.charAt(i), maxShift);
        }
    }

    public int search(){
        precomputeShifts();
        int textLength = this.text.length();
        int patternLength = this.pattern.length();
        int numOfSkips=0;

        for(int i=0; i<= textLength-patternLength; i += numOfSkips){//Main Advantage is no of skips

            numOfSkips=0; // Most imp to reset this for every iteration. not included last time and took 1 hour to solve this
            for(int j = patternLength-1; j >= 0; j--){
                if (pattern.charAt(j) != text.charAt(i + j)) {//Start matching from end
                    if (mismatchShiftTable.get(text.charAt(i + j)) != null) {
                        numOfSkips = mismatchShiftTable.get(text.charAt(i + j));
                    } else {
                        numOfSkips = patternLength;
                    }
                    System.out.println("noOfSkips: "+numOfSkips);//can be used for debugging
                    break;
                }
            }
            if (numOfSkips == 0){//Condition for matchin
               return i;
            }
        }

        return textLength;
    }
}
