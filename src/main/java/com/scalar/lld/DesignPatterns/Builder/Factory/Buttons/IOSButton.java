package com.scalar.lld.DesignPatterns.Builder.Factory.Buttons;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("IOS Button clicked");
    }
}
