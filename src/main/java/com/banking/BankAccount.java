package com.banking;


// The BankAccount class represents a bank account with a balance.
public class BankAccount {
    // The balance of the bank account.
    private double balance;

    // Constructs a new BankAccount with the specified initial balance.
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposits the specified amount into the bank account.
    public void deposit(double amount) {
        balance += amount;
    }

    // Attempts to withdraw the specified amount from the bank account.
    // Returns true if the withdrawal was successful, false otherwise.
    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    // Returns the current balance of the bank account.
    public double getBalance() {
        return balance;
    }
}
