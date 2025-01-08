package com.scalar.lld.Synchronization.AdderSubtractor;

public class Subtractor implements Runnable {
    Count count;
    Subtractor(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=1;i<1000000;i++){
            count.value-=1;
        }
    }
}
