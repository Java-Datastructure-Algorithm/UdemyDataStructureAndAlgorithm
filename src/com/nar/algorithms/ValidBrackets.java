package com.nar.algorithms;

import java.util.*;

public class ValidBrackets {


    public static boolean isValid(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }

        Map<String, String> mapping = new HashMap();
        mapping.put("{", "}");
        mapping.put("[", "]");
        mapping.put("(", ")");

        Set<String> startingBracSet = mapping.keySet();

        Stack<String>   stack = new Stack<>();

        char[] charArr = str.toCharArray();
        for(char ch : charArr){
            Character chtr = new Character(ch);
            String strCh = chtr.toString();
            if (startingBracSet.contains(strCh)) {
                stack.push(strCh);
            } else if(stack.size() > 0 ) {
                String popped = stack.pop();
                if (!mapping.get(popped).equals(strCh)) {
                    return false;
                }
            } else {
                return false;
            }

        }

        if (stack.size() == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        String str1 = "[{()}]";
        String str3 = "[]{}()";
        String str4 = "[]{(})";
        String str5 = "][{(})";
        System.out.println(str1 + ":" + isValid(str1));
        System.out.println(str3 + ":" + isValid(str3));
        System.out.println(str4 + ":" + isValid(str4));
        System.out.println(str5 + ":" + isValid(str5));

    }
}
