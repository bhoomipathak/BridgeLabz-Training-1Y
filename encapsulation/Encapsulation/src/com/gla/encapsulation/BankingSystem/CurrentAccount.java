package com.gla.encapsulation.BankingSystem;
public class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02;  // 2%
    private double loanAmount;
    public CurrentAccount(int acc, String name, double bal) {
        super(acc, name, bal);
    }
    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
    @Override
    public void applyForLoan(double amount) {
        loanAmount = amount;
        System.out.println("Loan Applied: " + amount);
    }
    @Override
    public boolean calculateLoanEligibility() {
        return balance > 10000;
    }
}
