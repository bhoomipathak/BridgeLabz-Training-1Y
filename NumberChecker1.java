package com.gla.method.Level3;

import java.util.*;
public class NumberChecker1{
    public static int countDigits(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }
    public static int[] digits(int n){
        int len=countDigits(n);
        int[] d=new int[len];
        for(int i=len-1;i>=0;i--){
            d[i]=n%10;
            n/=10;
        }
        return d;
    }
    public static boolean isDuck(int[] d){
        for(int i=1;i<d.length;i++)
            if(d[i]==0)
                return true;
        return false;
    }
    public static boolean isArmstrong(int n){
        int[] d=digits(n);
        int len=d.length;
        int sum=0;
        for(int i=0;i<len;i++)
            sum+=Math.pow(d[i],len);
        return sum==n;
    }
    public static int[] largestTwo(int[] d){
        int max=Integer.MIN_VALUE,sec=Integer.MIN_VALUE;
        for(int i=0;i<d.length;i++){
            if(d[i]>max){
                sec=max;
                max=d[i];
            }
            else if(d[i]>sec && d[i]!=max)
                sec=d[i];
        }
        return new int[]{max,sec};
    }
    public static int[] smallestTwo(int[] d){
        int min=Integer.MAX_VALUE,sec=Integer.MAX_VALUE;
        for(int i=0;i<d.length;i++){
            if(d[i]<min){
                sec=min;
                min=d[i];
            }
            else if(d[i]<sec && d[i]!=min)
                sec=d[i];
        }
        return new int[]{min,sec};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] d=digits(n);
        System.out.println("Digits="+countDigits(n));
        System.out.println("Duck="+isDuck(d));
        System.out.println("Armstrong="+isArmstrong(n));
        int[] l=largestTwo(d);
        int[] s=smallestTwo(d);
        System.out.println("Largest="+l[0]+" Second="+l[1]);
        System.out.println("Smallest="+s[0]+" Second="+s[1]);
    }
}
