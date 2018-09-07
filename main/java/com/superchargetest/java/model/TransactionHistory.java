package com.superchargetest.java.model;

import java.util.Date;

public class TransactionHistory {

    private static long count;

    private long id;

    private Date date;

    private long amount;

    private TransactionType typeOfTransaction;

    private User user;

    public TransactionHistory(Date date, long amount, TransactionType typeOfTransaction, User user) {
        id = ++count;
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

    @Override
    public String toString() {
        return  "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                ", typeOfTransaction=" + typeOfTransaction +
                "} \n\r";
    }
}
