package com.scalar.lld.DesignPatterns.Builder.Decorator;

public class ChocoSyrup implements IceCream{
    private IceCream iceCream;
    public ChocoSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if(iceCream!=null){
            return iceCream.getCost()+10;
        }
        return 0;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" + Choco Syrup";
    }
}
