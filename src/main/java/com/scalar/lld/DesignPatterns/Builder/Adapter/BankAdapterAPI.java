package com.scalar.lld.DesignPatterns.Builder.Adapter;

public interface BankAdapterAPI {
    public void TransferMoney(String from, String to, long amount);
    void registerAccount(String accountNumber);
    Long getAccountBalance(String accountNumber);
}
