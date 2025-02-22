package com.scalar.lld.DesignPatterns.Builder.Decorator;

public class ChocoCone implements IceCream{
    private IceCream iceCream;
    public ChocoCone(IceCream iceCream) {
        this.iceCream = iceCream;//acts as addon as well
    }

    public ChocoCone(){
        //base method
    }
    @Override
    public int getCost() {
        if(iceCream!=null){
            return iceCream.getCost()+15;
        }
        return 15;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" + ChocoCone";
    }
}
