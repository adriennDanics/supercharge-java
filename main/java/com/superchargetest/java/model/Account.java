package com.superchargetest.java.model;

import javax.persistence.*;

public class Account {

    private long accountNumber;

    private long accountBalance;

    public Account(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    private Account() {
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
