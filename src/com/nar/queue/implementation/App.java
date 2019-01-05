package com.nar.queue.implementation;

public class App {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        //Using java built in
        //Linked List is implementation of Queue
        java.util.Queue<String> queue1 = new java.util.LinkedList<String>();
        queue1.add("a");
        queue1.add("b");
        queue1.add("c");
        System.out.println(queue1.element());//same like peep
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
    }
}
