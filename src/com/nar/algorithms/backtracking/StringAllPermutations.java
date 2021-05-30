package com.nar.algorithms.backtracking;

public class StringAllPermutations {
    public static void main(String[] args) {
        StringAllPermutations permutations = new StringAllPermutations();
        String str = "ABC";
        permutations.permute(str, 0, str.length()-1);

    }

    private void permute(String str, int l, int r){
        if(l == r){
            System.out.println(str);
        }
        for(int i=l; i<=r; i++){
            str = swap(str, l, i);
            permute(str, l+1, r);
            str = swap(str, l, i);//Backtracking to make it as it was prevously, since we are modifying same string again
        }
    }

    public String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
