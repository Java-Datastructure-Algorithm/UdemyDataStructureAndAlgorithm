package com.nar.linkedlist.interviewQuestion;

import com.nar.linkedlist.implementation.LinkedList;

public class LinkedListInterviewRunner {
    public static void main(String[] args) {
        //---------Find Middle Element (using Linked List created by me)
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=1;i<7;i++){
            ll.insert(i);
        }

        System.out.println("Middle element "+ll.getMiddleNode());

        //----------Reverse ArrayList
        ll.reverse();
        ll.traverseList();

    }
}
