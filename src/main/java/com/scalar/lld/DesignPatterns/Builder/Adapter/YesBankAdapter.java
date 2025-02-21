package com.scalar.lld.DesignPatterns.Builder.Adapter;

import com.scalar.lld.DesignPatterns.Builder.Adapter.ThirdParty.YesBank;

public class YesBankAdapter implements BankAdapterAPI{
    YesBank yesBank=new YesBank();
    @Override
    public void TransferMoney(String from, String to, long amount) {
        yesBank.TransferMoney(from,to,amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public Long getAccountBalance(String accountNumber) {
        return 0L;
    }
}
