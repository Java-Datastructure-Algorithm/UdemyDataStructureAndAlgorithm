package com.nar.linkedlist.implementation;

public class App {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.insert("aa");
        list.insert("bb");
        list.insert("cc");
        list.insert("dd");

        System.out.println(list.size());
        list.traverseList();
        list.remove("bb");
        System.out.println("");
        list.traverseList();
    }
}
