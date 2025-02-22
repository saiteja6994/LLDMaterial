package com.scalar.lld.DesignPatterns.Builder.Decorator;

public class OrangeCone implements IceCream{

    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
