package com.nar.otherprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");



        Iterator it = list.iterator();

        System.out.println("---------Check Remove method---------");
        while(it.hasNext()){
            it.next();//This method throws ‘NoSuchElementException’ if there is no next element.
            it.remove(); // If we call remove method without calling next method it will throw IllegalStateException
        }
        System.out.println(list);

        System.out.println("----------Check ConcurrentModification exception------");

        list.add("e"); // change in structure of arralist after creating iterator
        while(it.hasNext()){
            System.out.println("test");
            System.out.println(it.next());
            list.add("s");

        }
    }
}
