package com.neoteric;


public class ReceiptGenerator {

    public void printReceipt(Transaction transaction) {

        System.out.println("UTR : " + transaction.utr);
        System.out.println("Date : " + transaction.date);
        System.out.println("Time : " + transaction.time);
        System.out.println("Amount : " + transaction.amount);

    }

}


