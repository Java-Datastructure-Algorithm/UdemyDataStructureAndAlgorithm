package com.nar.stack.implementation.stackUsingLinkedList;

public class Stack<T extends Comparable<T>> {

    private Node<T> rootNode;
    private int size;

    public void push (T data) {
        this.size++;
        if (rootNode == null) {
            rootNode = new Node<T>(data);
        } else {
            Node<T> oldRoot = rootNode;
            rootNode = new Node<T>(data);
            rootNode.setNextNode(oldRoot);
        }

    }

    //O(1) running time
    public T pop () {
        if(this.rootNode == null){
            return null;
        }
        T itemToPop = this.rootNode.getData();
        this.rootNode = this.rootNode.getNextNode();
        this.size--;
        return itemToPop;
    }

    public T peek () {
        if (this.rootNode != null){
            return this.rootNode.getData();
        } else {
            return null;
        }
    }

    public int size () {
        return this.size;
    }

}
