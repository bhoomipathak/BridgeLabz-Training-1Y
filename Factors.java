package com.gla.method.Level2;

import java.util.*;

public class Factors{
    public static int[] getFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                count++;
        int[] f=new int[count];
        int k=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                f[k++]=i;
        return f;
    }
    public static int sum(int[] f){
        int s=0;
        for(int i=0;i<f.length;i++)
            s+=f[i];
        return s;
    }
    public static int product(int[] f){
        int p=1;
        for(int i=0;i<f.length;i++)
            p*=f[i];
        return p;
    }
    public static double sumSquare(int[] f){
        double s=0;
        for(int i=0;i<f.length;i++)
            s+=Math.pow(f[i],2);
        return s;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=getFactors(n);
        System.out.println("Factors:");
        for(int i=0;i<f.length;i++)
            System.out.print(f[i]+" ");
        System.out.println("\nSum="+sum(f));
        System.out.println("Product="+product(f));
        System.out.println("Sum of squares="+sumSquare(f));
    }
}
