package com.gla.constructors.AccessModifiers;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(int n,String h,double b) {
        accountNumber=n;
        accountHolder=h;
        balance=b;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double b) {
        balance=b;
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(int n,String h,double b) {
        super(n,h,b);
    }
    void display() {
        System.out.println(accountNumber);
        System.out.println(accountHolder);
        System.out.println(getBalance());
    }
    public static void main(String args[]) {
        SavingsAccount s=new SavingsAccount(101,"Anubhav",5000);
        s.display();
        s.setBalance(9000);
        System.out.println(s.getBalance());
    }
}