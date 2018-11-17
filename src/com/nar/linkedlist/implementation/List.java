package com.nar.linkedlist.implementation;

public interface List<T extends Comparable<T>> {
    public void insert(T data);
    public void remove(T data);
    public int size();
    public void traverseList();
    public Node<T> getMiddleNode();
    public void reverse();
}
