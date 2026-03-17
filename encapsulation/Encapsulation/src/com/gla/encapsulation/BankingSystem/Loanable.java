package com.gla.encapsulation.BankingSystem;
public interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
