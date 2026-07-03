package com.neoteric;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Sender Account
        Account fromAccount = new Account(
                "1234567890",
                "Navya",
                50000
        );

        // Receiver Account
        Account toAccount = new Account(
                "9876543210",
                "Rahul",
                20000
        );

        // Transfer Amount
        double amount = 15000;

        // Create Objects
        AmountValidator amountValidator = new AmountValidator();
        BalanceChecker balanceChecker = new BalanceChecker();
        TransferService transferService = new TransferService();
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        TransactionHistory transactionHistory = new TransactionHistory();

        // Validate Amount
        if (!amountValidator.isValidAmount(amount)) {
            System.out.println("Invalid Amount");
            return;
        }

        // Check Balance
        if (!balanceChecker.hasSufficientBalance(fromAccount, amount)) {
            System.out.println("Insufficient Balance");
            return;
        }

        // Transfer Money
        transferService.transfer(fromAccount, toAccount, amount);

        // Generate Transaction Details
        String utr = Generate_UTR.generateUTR();
        String date = Generate_Date.generateDate();
        String time = Generate_Time.generateTime();

        // Create Transaction Object
        Transaction transaction = new Transaction(
                utr,
                date,
                time,
                fromAccount.accountNumber,
                toAccount.accountNumber,
                amount,
                "SUCCESS"
        );

        // Print Receipt
        receiptGenerator.printReceipt(transaction);

        // Save Transaction
        transactionHistory.addTransaction(transaction);

        // Display Balances
        System.out.println("\n========= ACCOUNT DETAILS =========");
        System.out.println("Sender Name      : " + fromAccount.accountHolderName);
        System.out.println("Sender Balance   : ₹" + fromAccount.balance);

        System.out.println();

        System.out.println("Receiver Name    : " + toAccount.accountHolderName);
        System.out.println("Receiver Balance : ₹" + toAccount.balance);

        // Transaction History
        System.out.println("\n========= TRANSACTION HISTORY =========");
        System.out.println("Navya")
        transactionHistory.showTransactions();
    }
}


