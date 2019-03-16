package com.nar.linkedlist.interviewQuestion;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=1; i<10; i++){
            linkedList.add(i);
        }

        //---------Find Middle
        LinkedListInterViewQuestions llir = new LinkedListInterViewQuestions();
        System.out.println(llir.findMiddle(linkedList));


    }
}
