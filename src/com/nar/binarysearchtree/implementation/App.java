package com.nar.binarysearchtree.implementation;

public class App {
    public static void main(String[] args) {
        Tree<Integer> bst = new BinarySearchTree<>();
        bst.insert(8);
        bst.insert(6);
        bst.insert(10);
        bst.insert(5);
        bst.insert(7);
        bst.insert(9);
        bst.insert(11);

        System.out.println(bst.getMax());
        System.out.println(bst.getMin());

        bst.traversal(); //inorder traversal sort tree elements

    }
}
