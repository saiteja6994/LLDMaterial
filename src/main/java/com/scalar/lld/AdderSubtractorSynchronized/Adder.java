package com.scalar.lld.AdderSubtractorSynchronized;

import lombok.Synchronized;

public class Adder implements Runnable {
    Count count;
    Adder(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=1;i<1000000;i++){
            synchronized(count){
                count.value+=1;
            }

        }
    }
}
