package com.gla.method.Level3;

import java.util.*;
public class NumberChecker5{
    public static int sumDivisors(int n){
        int sum=0;
        for(int i=1;i<n;i++)
            if(n%i==0)
                sum+=i;
        return sum;
    }
    public static boolean isPerfect(int n){
        return sumDivisors(n)==n;
    }
    public static boolean isAbundant(int n){
        return sumDivisors(n)>n;
    }
    public static boolean isDeficient(int n){
        return sumDivisors(n)<n;
    }
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        return f;
    }
    public static boolean isStrong(int n){
        int temp=n,sum=0;
        while(temp>0){
            sum+=fact(temp%10);
            temp/=10;
        }
        return sum==n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Perfect="+isPerfect(n));
        System.out.println("Abundant="+isAbundant(n));
        System.out.println("Deficient="+isDeficient(n));
        System.out.println("Strong="+isStrong(n));
    }
}
