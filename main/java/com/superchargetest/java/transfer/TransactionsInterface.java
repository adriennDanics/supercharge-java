package com.superchargetest.java.transfer;

import com.superchargetest.java.model.Account;
import com.superchargetest.java.model.User;

public interface TransactionsInterface {

    void addToAccount(Account account, long amount);

    void withdrawFromAccount(Account account, long amount);

    void transferFromAccount(Account accountNumberToTransferFrom, Account accountToTransferTo, User user, long amount);

}
