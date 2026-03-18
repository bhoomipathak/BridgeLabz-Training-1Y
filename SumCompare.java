package com.gla.method.Level2;

import java.util.*;
public class SumCompare {
    public static int recursive(int n){
        if(n==1) return 1;
        return n+recursive(n-1);
    }
    public static int formula(int n){
        return n*(n+1)/2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=recursive(n);
        int f=formula(n);
        System.out.println("Recursive="+r);
        System.out.println("Formula="+f);
        System.out.println("Same? "+(r==f));
    }
}