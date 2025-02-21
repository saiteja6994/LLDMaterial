package com.scalar.lld.DesignPatterns.Builder.Adapter.ThirdParty;

import com.scalar.lld.DesignPatterns.Builder.Adapter.BankAdapterAPI;

public class ICICBank {
    public void sendMoney(String to,String from,Long amount){
        System.out.println("Transferring money from ICICI Bank");
    }
}
