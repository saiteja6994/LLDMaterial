package com.scalar.lld.DesignPatterns.Builder.Factory.Buttons;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("AndroidButton clicked");
    }
}
