package com.scalar.lld.AdderSubtractorLock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Count count;
    Lock lock;
    Adder(Count count, Lock lock) {
        this.count = count;
        this.lock=lock;
    }
    @Override
    public void run() {
        for(int i=1;i<1000000;i++){
            lock.lock();
            count.value+=1;
            lock.unlock();
        }
    }
}
