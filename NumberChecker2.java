package com.gla.method.Level3;

import java.util.*;
public class NumberChecker2{
    public static int[] digits(int n){
        int len=(n+"").length();
        int[] d=new int[len];
        for(int i=len-1;i>=0;i--){
            d[i]=n%10;
            n/=10;
        }
        return d;
    }
    public static int sumDigits(int[] d){
        int s=0;
        for(int i=0;i<d.length;i++)
            s+=d[i];
        return s;
    }
    public static int sumSquares(int[] d){
        int s=0;
        for(int i=0;i<d.length;i++)
            s+=Math.pow(d[i],2);
        return s;
    }
    public static boolean isHarshad(int n){
        int[] d=digits(n);
        return n%sumDigits(d)==0;
    }
    public static int[][] frequency(int[] d){
        int[] f=new int[10];
        for(int i=0;i<d.length;i++)
            f[d[i]]++;
        int[][] res=new int[10][2];
        for(int i=0;i<10;i++){
            res[i][0]=i;
            res[i][1]=f[i];
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] d=digits(n);
        System.out.println("Sum="+sumDigits(d));
        System.out.println("SquareSum="+sumSquares(d));
        System.out.println("Harshad="+isHarshad(n));
        int[][] f=frequency(d);
        for(int i=0;i<10;i++)
            if(f[i][1]!=0)
                System.out.println(f[i][0]+" "+f[i][1]);
    }
}
