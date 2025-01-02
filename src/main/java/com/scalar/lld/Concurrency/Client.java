package com.scalar.lld.Concurrency;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!:Thread name:" + Thread.currentThread().getName());
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
    }


}
