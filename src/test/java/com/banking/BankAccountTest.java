package com.banking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// The BankAccountTest class contains tests for the BankAccount class.
public class BankAccountTest {
    // Tests the deposit and withdraw methods of the BankAccount class.
    @Test
    public void testDepositAndWithdraw() {

        // Create a new BankAccount with an initial balance of 0.
        BankAccount account = new BankAccount(0);

        // Deposit 100 into the account and check that the balance is now 100.
        account.deposit(100);
        assertEquals(100, account.getBalance());
        System.out.println("After depositing the amount, balance is: " + account.getBalance());

        // Withdraw 50 from the account and check that the balance is now 50.
        assertTrue(account.withdraw(50));
        assertEquals(50, account.getBalance());
        boolean withdrawSuccessful = account.withdraw(50);
        System.out.println("After attempting to withdraw 50, withdrawal was " + (withdrawSuccessful ? "successful" : "unsuccessful"));
        System.out.println("Current balance after withdrawal attempt is: " + account.getBalance());

        // Try to withdraw 60 from the account and check that the withdrawal fails.
        assertFalse(account.withdraw(60));
        assertEquals(50, account.getBalance());

        System.out.println("-----------------------------------------");

        account.deposit(200);

        withdrawSuccessful = account.withdraw(60);
        System.out.println("After attempting to withdraw 60, withdrawal was " + (withdrawSuccessful ? "successful" : "unsuccessful"));
        System.out.println("Final balance after all attempts is: " + account.getBalance());
    }
}
