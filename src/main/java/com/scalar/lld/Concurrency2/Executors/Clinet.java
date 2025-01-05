package com.scalar.lld.Concurrency2.Executors;

import com.scalar.lld.Concurrency2.Executors.NumberPrinter;
//import com.scalar.lld.Concurrency2.NumberPrinter;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Clinet {
    public static void main(String[] args) {
//        NumberPrinter numberPrinter=null;
//        Thread t=null;
//        for(int i=1;i<=100;i++){
//            numberPrinter = new NumberPrinter(i);
//            t=new Thread(numberPrinter);
//            t.start();
//        }
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++){
            NumberPrinter numberPrinter=new NumberPrinter(i);
            executorService.submit(numberPrinter);
        }

        executorService.shutdown();

    }
}
