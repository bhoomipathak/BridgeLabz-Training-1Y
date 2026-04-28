package com.gla.jbbc;
import java.util.*;

class Account {
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
}

public class BankManager {

    static ArrayList<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Add accounts)
        accounts.add(new Account(101, "Rahul", 8000));
        accounts.add(new Account(102, "Amit", 15000));
        accounts.add(new Account(103, "Neha", 25000));

        // READ (balance > 10000)
        System.out.println("Accounts with balance > 10000:");
        for (Account a : accounts) {
            if (a.balance > 10000) {
                System.out.println(a.accNo + " | " + a.name + " | " + a.balance);
            }
        }

        // UPDATE (Deposit / Withdraw)
        int targetAcc = 101;
        double depositAmount = 5000;
        double withdrawAmount = 2000;

        for (Account a : accounts) {
            if (a.accNo == targetAcc) {
                // Deposit
                a.balance += depositAmount;
                System.out.println("After Deposit: " + a.balance);

                // Withdraw (check balance)
                if (a.balance >= withdrawAmount) {
                    a.balance -= withdrawAmount;
                    System.out.println("After Withdrawal: " + a.balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }
            }
        }

        // DELETE (Close account)
        int deleteAcc = 102;
        accounts.removeIf(a -> a.accNo == deleteAcc);

        // Final List
        System.out.println("\nFinal Account List:");
        for (Account a : accounts) {
            System.out.println(a.accNo + " | " + a.name + " | " + a.balance);
        }
    }
}

