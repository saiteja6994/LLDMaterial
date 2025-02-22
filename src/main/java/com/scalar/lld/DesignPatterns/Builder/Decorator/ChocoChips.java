package com.scalar.lld.DesignPatterns.Builder.Decorator;

public class ChocoChips implements IceCream{
    private IceCream iceCream;
    public ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost(){
        if(iceCream!=null){
            return iceCream.getCost()+5;
        }
        return 0;
    }
    @Override
    public String getDescription(){

            return iceCream.getDescription()+" "+" Choco Chips";


    }
}
