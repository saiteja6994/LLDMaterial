package com.scalar.lld.Concurrency;

public class HelloWorldPrinter implements Runnable{
    public void run() {
        System.out.println("Hello world: Thread name:"+Thread.currentThread().getName());

    }
}
