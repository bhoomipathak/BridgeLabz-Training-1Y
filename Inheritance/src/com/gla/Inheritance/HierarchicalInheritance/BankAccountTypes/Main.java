package com.gla.Inheritance.HierarchicalInheritance.BankAccountTypes;
class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        CheckingAccount c = new CheckingAccount();
        FixedDepositAccount f = new FixedDepositAccount();
        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}

