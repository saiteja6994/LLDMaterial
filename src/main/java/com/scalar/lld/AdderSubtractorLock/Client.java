package com.scalar.lld.AdderSubtractorLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Count count = new Count();
        Adder adder = new Adder(count,lock);
        Subtractor subtractor = new Subtractor(count,lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();
        //todo: read about join
        t1.join();
        t2.join();
        System.out.println("Count: " + count.value);
    }
}
