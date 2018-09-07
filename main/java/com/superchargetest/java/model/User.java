package com.superchargetest.java.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private static long count;

    private long id;

    private List<TransactionHistory> transactions = new ArrayList<>();

    private Set<Account> accountNumbers = new HashSet<>();

    private String name;

    public User(Account accountNumber, String name) {
        id = ++count;
        this.accountNumbers.add(accountNumber);
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Account> getAccountNumber() {
        return accountNumbers;
    }

    public void setAccountNumber(Set<Account> accountNumber) {
        this.accountNumbers = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccountNumber(Account newAccountNumber) {
        this.accountNumbers.add(newAccountNumber);
    }

    public void addTransactions(TransactionHistory transaction) {
        transactions.add(transaction);
    }

    public List<TransactionHistory> getTransactions() {
        return transactions;
    }

    public List<TransactionHistory> getTypesOfTransactions(TransactionType type) {
        List<TransactionHistory> transactionHistoryList = new ArrayList<>();
        for (TransactionHistory transaction: transactions) {
            if((transaction.getTypeOfTransaction()).equals(type)){
                transactionHistoryList.add(transaction);
            }
        }
        return transactionHistoryList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", accountNumbers=" + accountNumbers +
                ", transactions=" + transactions +
                ", name='" + name + '\'' +
                '}';
    }
}
