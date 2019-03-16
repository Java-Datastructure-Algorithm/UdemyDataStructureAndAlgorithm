package com.nar.linkedlist.interviewQuestion;

import com.nar.linkedlist.implementation.LinkedList;

public class LinkedListInterviewRunner {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=7;i>0;i--){
            ll.insert(i);
        }

        //---------Find Middle Element (using Linked List created by me)
        System.out.println("Middle element "+ll.getMiddleNode());

        //----------Reverse ArrayList
        ll.reverse();
        ll.traverseList();

        System.out.println("------------Check Cyclic-------------");
        boolean isCyclic = ll.isCyclic();
        System.out.println("isCyclic: "+isCyclic);

        System.out.println("------------Nth Node from last-------------");
        Integer nthLastNode = ll.genNthNodeFromLast(4);
        System.out.println(nthLastNode);
    }
}
