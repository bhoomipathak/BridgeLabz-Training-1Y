package com.gla.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Division{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter first number: ");
            double a=sc.nextDouble();
            System.out.print("Enter second number: ");
            double b=sc.nextDouble();
            double result=a/b;
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter valid numeric values.");
        }
    }
}