package com.scalar.lld.ProducerConsumerProblemSolution;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
    public static void main(String[] args) {
        Queue<Object> queue=new ConcurrentLinkedQueue<>();
        int maxSize=6;

        Producer p1=new Producer(queue,maxSize,"P1");
        Producer p2=new Producer(queue,maxSize,"P2");
//        Producer p3=new Producer(queue,maxSize,"P3");
//        Producer p4=new Producer(queue,maxSize,"P4");
//        Producer p5=new Producer(queue,maxSize,"P5");

        Consumer c1=new Consumer(queue,maxSize,"C1");
        Consumer c2=new Consumer(queue,maxSize,"C2");
        Consumer c3=new Consumer(queue,maxSize,"C3");
        Consumer c4=new Consumer(queue,maxSize,"C4");
        Consumer c5=new Consumer(queue,maxSize,"C5");
        Consumer c6=new Consumer(queue,maxSize,"C6");

//        ExecutorService executorService= Executors.newCachedThreadPool();
//        executorService.submit(p1);
//        executorService.submit(p2);
//        executorService.submit(p3);
//        executorService.submit(p4);
//        executorService.submit(p5);
//        executorService.submit(c1);
//        executorService.submit(c2);
//        executorService.submit(c3);

        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
//        Thread t3=new Thread(p3);
//        Thread t4=new Thread(p4);
//        Thread t5=new Thread(p5);
        t1.start();
        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();

        Thread t6=new Thread(c1);
        t6.start();
        Thread t7=new Thread(c2);
        t7.start();
        Thread t8=new Thread(c3);
        t8.start();
        Thread t9=new Thread(c4);
        t9.start();
        Thread t10=new Thread(c5);
        t10.start();
        Thread t11=new Thread(c6);
        t11.start();
        Thread t12=new Thread(c6);
        t12.start();
//        Thread t9=new Thread(p4);
//        t9.start();
//        Thread t10=new Thread(p5);
//        t10.start();
    }
}
