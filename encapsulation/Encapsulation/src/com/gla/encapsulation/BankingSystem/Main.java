package com.gla.encapsulation.BankingSystem;
public class Main{
    public static void processAccount(BankAccount account) {
        account.displayDetails();
        double interest = account.calculateInterest();
        System.out.println("Interest: " + interest);
        Loanable loan = (Loanable) account;
        loan.applyForLoan(20000);
        if (loan.calculateLoanEligibility())
            System.out.println("Eligible for Loan");
        else
            System.out.println("Not Eligible");

        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount(101, "Anubhav", 8000);
        BankAccount a2 = new CurrentAccount(102, "Rahul", 7000);
        processAccount(a1);
        processAccount(a2);
    }
}
