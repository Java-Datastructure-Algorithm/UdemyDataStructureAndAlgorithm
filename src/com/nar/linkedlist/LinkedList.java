package com.nar.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T>{

    private Node<T> rootNode;
    private int sizeCounter;

    @Override
    public void insert(T data) {
        //Could be insert at beginning or at the end
        //If LinkedList is empty or not
        ++this.sizeCounter;

        if (rootNode == null) {
            rootNode = new Node<>(data);
        } else {
            //insertAtBeginning(data);
            insertAtEnd(data , rootNode);
        }
    }

    // O(1) constant time complexity, update the references
    private void insertAtBeginning (T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(rootNode);
        rootNode = newNode;
    }

    // O(N) inserting at the end
    private void insertAtEnd (T data, Node<T> currentNode) {
        //Base Logic is find the last node and refer its nextNode to this new node.
            //But if list is empty then

        if(currentNode.getNextNode() != null) {
            insertAtEnd(data, currentNode.getNextNode());
        } else{
            currentNode.setNextNode(new Node(data));
        }
    }

    @Override
    public void remove(T data) {
        /*  - If List is empty or not
            - Main logic is to find the node and mark its previous node's nextNode to refer current node's next node
                But except for the starting root node all nodes have previous node.
                Therefore need to handle root node removal logic separately
            - Here require three nodes, previous, current and next node but since current node
                can refer next node we only require previous and current node)*/

        if (rootNode == null) {
            return;
        }

        --this.sizeCounter;
        if (rootNode.getData().compareTo(data) == 0) {
            rootNode = rootNode.getNextNode();
            return;
        } else {
            remove ( data, rootNode, rootNode.getNextNode());
        }

    }

    private void remove (T data, Node<T> previousNode, Node<T> currentNode) {


        while (currentNode != null) {
            if (currentNode.getData().compareTo(data) == 0) {
                previousNode.setNextNode(currentNode.getNextNode());
                currentNode = null; // To mark it for garbage collection
                return;
            }

            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.getSizeCounter();
    }

    @Override
    public void traverseList() {
        // if list is empty or not empty
        if (rootNode == null) {
            return;
        } else {
            Node<T> node = rootNode;
            while (node != null) {
                System.out.print( node.getData() + "->");
                node = node.getNextNode();
            }
        }
    }

    public Node<T> getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node<T> rootNode) {
        this.rootNode = rootNode;
    }

    public int getSizeCounter() {
        return sizeCounter;
    }

    public void setSizeCounter(int sizeCounter) {
        this.sizeCounter = sizeCounter;
    }
}
