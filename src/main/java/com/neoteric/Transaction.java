package com.neoteric;



public class Transaction {

    String utr;
    String date;
    String time;
    String fromAccount;
    String toAccount;
    double amount;
    String status;

    public Transaction(String utr,
                       String date,
                       String time,
                       String fromAccount,
                       String toAccount,
                       double amount,
                       String status) {

        this.utr = utr;
        this.date = date;
        this.time = time;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
    }
}


