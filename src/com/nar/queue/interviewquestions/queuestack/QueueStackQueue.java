package com.nar.queue.interviewquestions.queuestack;

import java.util.Stack;

public class QueueStackQueue {

    //Using only one stack, but this approach internally using inbuild memory stack
    private Stack<Integer> queueStack;

    public QueueStackQueue() {
        this.queueStack = new Stack<>();
    }

    public void enqueue(Integer value){
        queueStack.push(value);
    }

    public Integer dequeue(){
        //Dequeue recursively

        //base case for recursive call
        if(queueStack.size() == 1){
            return queueStack.pop();
        }

        //We keep popping item until we find last item
        Integer item = queueStack.pop();

        //We call method recursively
        Integer lastDequeuedItem = dequeue();

        //After we find item we dequeue we have to reinsert the item one by one
        enqueue(item);

        //This is the item we are looking for (this is what have been popped off  in the stack.size()==1 section)
        return lastDequeuedItem;

    }
}
