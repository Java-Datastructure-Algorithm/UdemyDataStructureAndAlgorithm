package com.nar.stack.implementation.stackUsingArray;

public class Stack<T> {//Extent Comparable was not working
    //Since array have default values we need to maintain numOfItems separately since array.length gives capacity instead of actual nuber of values presetn

    private T[] stackArr;
    private int numOfItems; //Acts as pointer to top

    public Stack() {
        this.stackArr = (T[]) new Object[1];
    }

    public void push (T data){
        if ( numOfItems == stackArr.length) {
            resizeArr (stackArr.length*2);
        }
        this.stackArr[numOfItems++] = data;
    }

    public T pop(){
        if(numOfItems == 0){
            return null;
        }

        if (numOfItems>0 && numOfItems == this.stackArr.length/4){
            resizeArr(this.stackArr.length/2);
        }
        T itemToPop = this.stackArr[--numOfItems];
        this.stackArr[numOfItems] = null; //Mark for garbage collection
        return itemToPop;
    }

    public int getSize() {
        return this.stackArr.length;
    }

    public boolean isEmpty(){
        if(this.stackArr.length == 0){
            return  true;
        }
        return false;
    }

    //O(N) linear time complexity
    private void resizeArr(int capacity){
        T[] arrCopy = (T[]) new Object[capacity];
        for(int i= 0; i < numOfItems; i++){
            arrCopy[i] = this.stackArr[i];
        }

        this.stackArr = arrCopy;
    }
}
