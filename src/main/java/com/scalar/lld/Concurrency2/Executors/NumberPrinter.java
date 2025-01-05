package com.scalar.lld.Concurrency2.Executors;

public class NumberPrinter implements Runnable{
    int number;
    public NumberPrinter(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println(number + " is printed by " + Thread.currentThread().getName());
    }
}
