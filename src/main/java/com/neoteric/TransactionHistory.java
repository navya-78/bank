package com.neoteric;


import java.util.ArrayList;

public class TransactionHistory {

    ArrayList<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {

        transactions.add(transaction);

    }

    public void showTransactions() {

        for (Transaction transaction : transactions) {

            System.out.println("------------------------------");
            System.out.println("UTR : " + transaction.utr);
            System.out.println("Date : " + transaction.date);
            System.out.println("Time : " + transaction.time);
            System.out.println("From : " + transaction.fromAccount);
            System.out.println("To : " + transaction.toAccount);
            System.out.println("Amount : ₹" + transaction.amount);
            System.out.println("Status : " + transaction.status);
        }

    }

}


