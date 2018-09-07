package com.superchargetest.java.controller;

import com.superchargetest.java.model.Account;
import com.superchargetest.java.model.TransactionHistory;
import com.superchargetest.java.model.TransactionType;
import com.superchargetest.java.model.User;

import java.util.Date;

public class Transactions implements TransactionsInterface {

    private User user;
    private String lowFundsMessage = "Your account does not have the necessary funds for this operation.";
    private String wrongUserOrAccount = "You are not associated with this account, this operation has been terminated";

    public Transactions(User user) {
        this.user = user;
    }

    @Override
    public void addToAccount(Account account, long amount) {
        if (user.getAccountNumber().contains(account)) {
            TransactionHistory transactionHistory = new TransactionHistory(new Date(), amount, TransactionType.DEPOSIT, user);
            user.addTransactions(transactionHistory);
            add(account, amount);
        } else {
            System.out.println(wrongUserOrAccount);
        }
    }

    @Override
    public void withdrawFromAccount(Account account, long amount) {
        if (user.getAccountNumber().contains(account)) {
            TransactionHistory transactionHistory = new TransactionHistory(new Date(), amount, TransactionType.WITHDRAWAL, user);
            user.addTransactions(transactionHistory);
            subtract(account, amount);
        } else {
            System.out.println(wrongUserOrAccount);
        }
    }

    @Override
    public void transferFromAccount(Account accountNumberToTransferFrom, Account accountToTransferTo, User userToGiveTo, long amount) {
        if (user.getAccountNumber().contains(accountNumberToTransferFrom) && userToGiveTo.getAccountNumber().contains(accountToTransferTo)) {
            subtract(accountNumberToTransferFrom, amount);
            add(accountToTransferTo, amount);
            TransactionHistory transactionHistory = new TransactionHistory(new Date(), amount, TransactionType.TRANSFER, user);
            user.addTransactions(transactionHistory);
            userToGiveTo.addTransactions(transactionHistory);
        } else {
            System.out.println(wrongUserOrAccount);
        }
    }

    private void add(Account account, long amount) {
        long accountBalance = account.getAccountBalance();
        account.setAccountBalance(accountBalance + amount);
        System.out.println("" + amount + " has been added to your account. Your new balance is: " + account.getAccountBalance() + "!");
    }


    private void subtract(Account account, long amount) {
        long accountBalance = account.getAccountBalance();
        if ((accountBalance - amount) < 0) {
            System.out.println(lowFundsMessage);
        } else {
            account.setAccountBalance(accountBalance - amount);
            System.out.println("Your request has been processed, " + user.getName() + ", your new account balance is " + account.getAccountBalance());
        }
    }

}
