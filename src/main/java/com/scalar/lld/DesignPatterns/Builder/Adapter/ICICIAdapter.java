package com.scalar.lld.DesignPatterns.Builder.Adapter;

import com.scalar.lld.DesignPatterns.Builder.Adapter.ThirdParty.ICICBank;
import com.scalar.lld.DesignPatterns.Builder.Adapter.ThirdParty.YesBank;

public class ICICIAdapter implements BankAdapterAPI{
    ICICBank icicBank=new ICICBank();
    @Override
    public void TransferMoney(String from, String to, long amount) {
        icicBank.sendMoney(to,from,amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public Long getAccountBalance(String accountNumber) {
        return 0L;
    }
}
