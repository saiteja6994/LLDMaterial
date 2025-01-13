package com.scalar.lld.ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private String threadName;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    public Consumer(Queue<Object> queue, int maxSize, String threadName,Semaphore producerSemaphore,Semaphore consumerSemaphore) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.threadName = threadName;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while (true) {

            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Consumer "+this.threadName+": is producing, store size="+queue.size());
            queue.remove();

            producerSemaphore.release();

        }
    }
}
