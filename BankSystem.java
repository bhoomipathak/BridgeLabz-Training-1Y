package com.gla.exceptionhandling;
import java.util.*;
public class BankSystem{
    static class InsufficientBalanceException extends Exception{
        InsufficientBalanceException(String msg){
            super(msg);
        }
    }
    public static double withdraw(double balance,double amount) throws InsufficientBalanceException{
        if(amount<0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance-=amount;
        return balance;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter balance: ");
            double balance=sc.nextDouble();
            System.out.print("Enter withdrawal amount: ");
            double amount=sc.nextDouble();
            balance=withdraw(balance,amount);
            System.out.println("Withdrawal successful, new balance: "+balance);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println("Amount cannot be negative");
        }
    }
}