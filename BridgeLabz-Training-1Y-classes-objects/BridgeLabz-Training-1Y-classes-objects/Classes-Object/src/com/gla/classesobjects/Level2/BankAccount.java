package com.gla.classesobjects.Level2;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    BankAccount(String h,int n,double b){
        accountHolder=h;
        accountNumber=n;
        balance=b;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited: "+amount);
    }
    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdrawn: "+amount);
        }
        else
            System.out.println("Insufficient Balance");
    }
    void display(){
        System.out.println("Balance: "+balance);
    }
    public static void main(String args[]){
        BankAccount a=new BankAccount("Anubhav",101,5000);
        a.deposit(2000);
        a.withdraw(3000);
        a.display();
    }
}
