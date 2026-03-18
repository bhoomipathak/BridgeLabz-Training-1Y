package com.gla.method.Level3;

import java.util.*;
public class NumberChecker3{
    public static int[] digits(int n){
        int len=(n+"").length();
        int[] d=new int[len];
        for(int i=len-1;i>=0;i--){
            d[i]=n%10;
            n/=10;
        }
        return d;
    }
    public static int[] reverse(int[] d){
        int[] r=new int[d.length];
        for(int i=0;i<d.length;i++)
            r[i]=d[d.length-1-i];
        return r;
    }
    public static boolean equal(int[] a,int[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++)
            if(a[i]!=b[i])
                return false;
        return true;
    }
    public static boolean isPalindrome(int n){
        int[] d=digits(n);
        return equal(d,reverse(d));
    }
    public static boolean isDuck(int n){
        int[] d=digits(n);
        for(int i=1;i<d.length;i++)
            if(d[i]==0)
                return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Palindrome="+isPalindrome(n));
        System.out.println("Duck="+isDuck(n));
    }
}
