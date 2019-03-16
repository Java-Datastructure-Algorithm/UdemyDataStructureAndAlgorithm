package com.nar.linkedlist.interviewQuestion;

import java.util.LinkedList;

public class LinkedListInterViewQuestions {

    //----------Find middle using java.util.LinkedList
    public Integer findMiddle(LinkedList<Integer> list){
        // In java.util.LinkedList we cant access inner class node
        // so don't try to use while loop and node.next for this
        if(list == null){
            return null;
        }
        int size = list.size();
        int middle = size/2;
        return list.get(middle);
    }
}
