package com.neoteric;

public class TransferService {

    public void transfer(Account from, Account to, double amount) {

        from.balance -= amount;
        to.balance += amount;

        System.out.println("Transfer Successful");
    }

}
