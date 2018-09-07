package com.superchargetest.java.model;

import javax.persistence.*;
import java.net.UnknownServiceException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TransactionHistory {
    private long id;

    private Date date;

    private long amount;

    private TransactionType typeOfTransaction;

    private User user;

    public TransactionHistory(Date date, long amount, TransactionType typeOfTransaction, User user) {
        this.date = date;
        this.amount = amount;
        this.typeOfTransaction = typeOfTransaction;
        this.user = user;
    }


    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public TransactionType getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(TransactionType typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    private TransactionHistory() {
    }
}
