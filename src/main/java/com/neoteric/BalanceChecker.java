package com.neoteric;

public class BalanceChecker {
    public boolean hasSufficientBalance(Account account, double amount) {

        return account.balance >= amount;

    }

}

