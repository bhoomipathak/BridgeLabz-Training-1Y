package com.gla.Inheritance.HierarchicalInheritance.BankAccountTypes;
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}
