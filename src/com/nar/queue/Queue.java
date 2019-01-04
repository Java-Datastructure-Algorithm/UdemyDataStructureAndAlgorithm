package com.nar.queue;

public class Queue<T extends Comparable<T>> {
    // Have pointer to first and last element
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int count;

    public boolean isEmpty(){
        if(this.count == 0){
            return true;
        }
        return false;
    }

    public void enqueue(T data) {// format   a(lastNode) <- b <- c <- d(fistNode (remember with firstnode first out and water pipe)))

        Node<T> node = new Node<>(data);

        if(isEmpty()){
            this.firstNode = node;
            this.lastNode = node;
        } else {
            Node<T> oldLastNode = this.lastNode;
            this.lastNode = node;
            oldLastNode.setNextNode(this.lastNode);
        }

        this.count++;
    }

    public T dequeue(){

        if(isEmpty()){
            return null;
        } else {// check for 1 and multiple
            this.count--;
            T dataToDequeue = this.firstNode.getData();
            this.firstNode = this.firstNode.getNextNode();

            if(isEmpty()){
                this.lastNode = null;
            }
            return dataToDequeue;
        }

    }



}
