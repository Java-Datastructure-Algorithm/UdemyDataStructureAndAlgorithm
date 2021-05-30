package com.nar.algorithms;

public class FormattedString {
    //If consecutive even then append * , if odd then append -
    public static void main(String[] args) {
        System.out.println(formattedStr("21462675756"));

    }

    public static String formattedStr(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();

        for (int i=0; i<charArr.length-1; i++) {
            String currentCharStr = String.valueOf(charArr[i]);
            String nextCharStr = String.valueOf(charArr[i+1]);
            Integer val1 = Integer.valueOf(currentCharStr);
            Integer val2 = Integer.valueOf(nextCharStr);
            if (val1%2==0 && val2%2==0) {
                sb.append(currentCharStr);
                sb.append("*");
            } else if (!(val1 % 2 == 0) && !(val2 % 2 == 0)) {
                sb.append(currentCharStr);
                sb.append("-");
            } else {
                sb.append(currentCharStr);
            }
        }

        String lastCharStr = String.valueOf(str.charAt(str.length()-1));
        sb.append(lastCharStr);

        return sb.toString();


    }
}
