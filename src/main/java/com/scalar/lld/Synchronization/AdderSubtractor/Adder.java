package com.scalar.lld.Synchronization.AdderSubtractor;

public class Adder implements Runnable {
    Count count;
    Adder(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=1;i<1000000;i++){
            count.value+=1;
        }
    }
}
