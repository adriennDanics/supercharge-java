package com.superchargetest.java.model;

public class Account {

    private static long count;

    private long accountNumber;

    private long accountBalance;

    public Account(long accountBalance) {
        accountNumber = ++count;
        this.accountBalance = accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
