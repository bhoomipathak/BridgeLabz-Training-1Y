package com.gla.Inheritance.HierarchicalInheritance.BankAccountTypes;
class SavingsAccount extends BankAccount {
    double interestRate;
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}
