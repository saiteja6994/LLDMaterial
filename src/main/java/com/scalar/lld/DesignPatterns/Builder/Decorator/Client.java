package com.scalar.lld.DesignPatterns.Builder.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream=new ChocoChips(new ChocoChips(
                new ChocoSyrup(new ChocoCone(new OrangeCone()))
        ));

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
