package com.scalar.lld.ProducerConsumerProblemSolution;

import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private String threadName;
    public Consumer(Queue<Object> queue, int maxSize, String threadName) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.threadName = threadName;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                if(queue.size() > 0) {
                    System.out.println("Consumer "+this.threadName+": is producing, store size="+queue.size());
                    queue.remove();
                }
            }

        }
    }
}
