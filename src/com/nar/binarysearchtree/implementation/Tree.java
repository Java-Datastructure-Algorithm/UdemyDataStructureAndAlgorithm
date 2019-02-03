package com.nar.binarysearchtree.implementation;

public interface Tree<T> {

    public void traversal();
    public void insert(T data);
    public void deleted(T data);
    public T getMax();
    public T getMin();
}
