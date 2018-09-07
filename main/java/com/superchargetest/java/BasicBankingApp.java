package com.superchargetest.java;

import com.superchargetest.java.transfer.Transactions;
import com.superchargetest.java.model.Account;
import com.superchargetest.java.model.TransactionType;
import com.superchargetest.java.model.User;

public class BasicBankingApp {

    public static void main(String[] args) {
        Account account = new Account(50L);
        User user = new User(account, "Balazs");
        Transactions transactions = new Transactions(user);

        Account account2 = new Account(200L);
        User user2 = new User(account2, "Huh");
        Transactions transactions2 = new Transactions(user2);

        transactions.addToAccount(account, 100L);
        transactions2.addToAccount(account2, 50L);
        transactions.withdrawFromAccount(account, 1000000);
        transactions.transferFromAccount(account, account2, user2,30);
        transactions.withdrawFromAccount(account, 80);
        System.out.println(user.getTransactions());
        System.out.println(user2.getTransactions());
        System.out.println(user.getTypesOfTransactions(TransactionType.TRANSFER));
        System.out.println(user2.getTypesOfTransactions(TransactionType.TRANSFER));

    }
}
