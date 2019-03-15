package com.nar.string.substringsearch;

public class BruteForceSearch {
    public int searchText(String text, String pattern){
        int textLength = text.length();
        int patternLength = pattern.length();

        for(int i = 0; i <= textLength-patternLength; i++){// its <=
            int j =0; // keeping j separate
            for(j = 0; j < patternLength; j++){
                if(text.charAt(j+i) != pattern.charAt(j)){// j+i
                    break;
                }
            }

            if(j == patternLength){ // In case of all match
                return  i;
            }
        }
        return textLength;
    }
}
