package com.scalar.lld.DesignPatterns.Builder.Adapter;

public class PhonePe {
    public static void main(String[] args) {
        BankAdapterAPI bankAdapterAPI=new ICICIAdapter();
        bankAdapterAPI.TransferMoney("1234","3456",1000);
    }
}
