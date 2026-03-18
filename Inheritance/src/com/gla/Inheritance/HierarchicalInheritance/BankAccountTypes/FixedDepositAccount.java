package com.gla.Inheritance.HierarchicalInheritance.BankAccountTypes;
class FixedDepositAccount extends BankAccount {
    int tenure;
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
