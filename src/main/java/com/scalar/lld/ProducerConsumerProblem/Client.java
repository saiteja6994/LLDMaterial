package com.scalar.lld.ProducerConsumerProblem;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Queue<Object> queue=new ConcurrentLinkedQueue<>();
        int maxSize=6;

        Producer p1=new Producer(queue,maxSize,"P1");
        Producer p2=new Producer(queue,maxSize,"P2");
        Producer p3=new Producer(queue,maxSize,"P3");
        Producer p4=new Producer(queue,maxSize,"P4");
        Producer p5=new Producer(queue,maxSize,"P5");

        Consumer c1=new Consumer(queue,maxSize,"C1");
        Consumer c2=new Consumer(queue,maxSize,"C2");
        Consumer c3=new Consumer(queue,maxSize,"C3");

        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.submit(p1);
        executorService.submit(p2);
        executorService.submit(p3);
        executorService.submit(p4);
        executorService.submit(p5);
        executorService.submit(c1);
        executorService.submit(c2);
        executorService.submit(c3);

    }
}
