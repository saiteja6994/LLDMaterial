package com.scalar.lld.DesignPatterns.Builder.Adapter.ThirdParty;

import com.scalar.lld.DesignPatterns.Builder.Adapter.BankAdapterAPI;

public class YesBank{
    public void TransferMoney(String from, String to, long amount){
        System.out.println("Transferring Money from YesBank");
    }
}
