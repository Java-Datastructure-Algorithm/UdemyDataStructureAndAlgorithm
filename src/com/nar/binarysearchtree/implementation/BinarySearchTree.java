package com.nar.binarysearchtree.implementation;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{
    private Node<T> root;

    @Override
    public void traversal() {
        if(root != null){
            inOrderTraversal(root);
        }
    }

    private void inOrderTraversal(Node<T> node){
        if(node.getLeftChild() != null){
            inOrderTraversal(node.getLeftChild());
        }

        System.out.print(node.getData() +"--->");

        if(node.getRightChild() != null){
            inOrderTraversal(node.getRightChild());
        }
    }

    @Override
    public void insert(T data) {
        if(root == null){
            root = new Node(data);
        } else{
            insertNode(data, root);
        }
    }

    private void insertNode(T newData, Node<T> node){
        if( newData.compareTo(node.getData()) < 0){ //Setting left child
            if(node.getLeftChild() == null){
                Node<T> newNode = new Node<>(newData);
                node.setLeftChild(newNode);
            } else {
                insertNode(newData, node.getLeftChild());
            }
        } else{
            if(node.getRightChild() == null){
                Node<T> newNode = new Node<>(newData);
                node.setRightChild(newNode);
            } else {
                insertNode(newData, node.getRightChild());
            }
        }
    }

    @Override
    public void deleted(T data) {
        if(root != null){

        }

    }

    private Node<T> delete(Node<T> node, T data) {


        if( node == null ) return node;

        if( data.compareTo(node.getData()) < 0 ) {
            node.setLeftChild( delete(node.getLeftChild(), data) );
        } else if ( data.compareTo(node.getData()) > 0 ) {
            node.setRightChild( delete(node.getRightChild(), data) );
        } else {

            // we have found the node we want to remove !!!
            if( node.getLeftChild() == null && node.getRightChild() == null ) {
                System.out.println("Removing a leaf node...");
                return null;
            }

            if( node.getLeftChild() == null ) {
                System.out.println("Removing the right child...");
                Node<T> tempNode = node.getRightChild();
                node = null;
                return tempNode;
            } else if( node.getRightChild() == null ) {
                System.out.println("Removing the left child...");
                Node<T> tempNode = node.getLeftChild();
                node = null;
                return tempNode;
            }

            // this is the node with two children case !!!
            System.out.println("Removing item with two children...");
            Node<T> tempNode = getPredecessor(node.getLeftChild());

            node.setData(tempNode.getData());
            node.setLeftChild( delete(node.getLeftChild(), tempNode.getData()) );

        }

        return node;
    }

    private Node<T> getPredecessor(Node<T> node) {

        if( node.getRightChild() != null )
            return getPredecessor(node.getRightChild());

        System.out.println("Predecessor is: "+node);
        return node;
    }



    @Override
    public T getMax() {
        if(root == null ){
            return null;
        }
        return getMaxNode(root);
    }

    private T getMaxNode(Node<T> node){
        if (node.getRightChild() != null) {
            return getMaxNode(node.getRightChild()); //will not give correct result if return not written here
        }
        return node.getData();
    }

    @Override
    public T getMin() {
        if(root == null){
            return null;
        }
        return getMinNode(root);
    }

    private T getMinNode(Node<T> node){
        if (node.getLeftChild() != null) {
            return getMinNode(node.getLeftChild());
        }
        return node.getData();
    }
}
