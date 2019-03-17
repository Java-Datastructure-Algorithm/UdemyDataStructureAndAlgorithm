package com.nar.linkedlist.interviewQuestion;

import com.nar.linkedlist.implementation.LinkedList;

public class LinkedListInterviewRunner {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=7;i>0;i--){
            ll.insert(i);
        }

        //----------All Operations using Linked List created by me

        System.out.println("---------Find Middle Element ");
        System.out.println("Middle element "+ll.getMiddleNode());

        System.out.println("----------Reverse ArrayList---------");
        ll.reverse();
        ll.traverseList();

        System.out.println("------------Check Cyclic-------------");
        boolean isCyclic = ll.isCyclic();
        System.out.println("isCyclic: "+isCyclic);

        System.out.println("------------Nth Node from last-------------");
        Integer nthLastNode = ll.genNthNodeFromLast(4);
        System.out.println(nthLastNode);

        System.out.println("------------Remove Duplicates-------------");
        ll.insert(1);
        ll.insert(2);
        System.out.println("Old data");
        ll.traverseList();
        ll.removeDuplicates();
        System.out.println("New data");
        ll.traverseList();
    }
}
