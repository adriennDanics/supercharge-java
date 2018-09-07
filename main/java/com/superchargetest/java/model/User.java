package com.superchargetest.java.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

    private long id;

    private Set<Account> accountNumbers = new HashSet<>();

    private Set<TransactionHistory> transactions = new HashSet<>();

    private String name;

    public User(Account accountNumber, String name) {
        this.accountNumbers.add(accountNumber);
        this.name = name;
    }

    private User() {
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
