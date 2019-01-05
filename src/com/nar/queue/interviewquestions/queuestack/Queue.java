package com.nar.queue.interviewquestions.queuestack;

import java.util.Stack;

public class Queue {
    //one stack for enqueue operation
    private Stack<Integer> enqueueStack;
    //use another stack for dequeue operation
    private Stack<Integer> dequeueStack;

    public Queue() {
        this.enqueueStack = new Stack<>();
        this.dequeueStack = new Stack<>();
    }

    public void enqueue(Integer value){
        enqueueStack.push(value);
    }

    public Integer dequeue(){ //logic: if deqstack is empty then pop all elements from enqstack and push it to deqstack and return top
        //if deqstack is not empty, just return the top value

        if(enqueueStack.isEmpty() && dequeueStack.isEmpty()){
            throw new RuntimeException("Stacks are empty");
        }

        if(dequeueStack.isEmpty()){
            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }

        return dequeueStack.pop();
    }
}
