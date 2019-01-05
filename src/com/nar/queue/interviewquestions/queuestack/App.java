package com.nar.queue.interviewquestions.queuestack;

public class App {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        QueueStackQueue queueStackQueue = new QueueStackQueue();
        queueStackQueue.enqueue(10);
        queueStackQueue.enqueue(11);
        queueStackQueue.enqueue(12);

        System.out.println(queueStackQueue.dequeue());
        System.out.println(queueStackQueue.dequeue());
        System.out.println(queueStackQueue.dequeue());
    }
}
