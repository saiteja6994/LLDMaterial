package com.scalar.lld.Concurrency2;

public class Clinet {
    public static void main(String[] args) {
        NumberPrinter numberPrinter=null;
        Thread t=null;
        for(int i=1;i<=100;i++){
            numberPrinter = new NumberPrinter(i);
            t=new Thread(numberPrinter);
            t.start();
        }
    }
}
