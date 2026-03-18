package com.gla.method.Level3;

import java.util.*;
public class FactorTasks{
    public static int[] factors(int n){
        int count=0;
        for(int i=1;i<=n;i++)
            if(n%i==0) count++;
        int[] f=new int[count];
        int k=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                f[k++]=i;
        return f;
    }
    public static int greatest(int[] f){
        return f[f.length-1];
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
    public static double cubeProduct(int[] f){
        double p=1;
        for(int i=0;i<f.length;i++)
            p*=Math.pow(f[i],3);
        return p;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=factors(n);
        System.out.println("Greatest="+greatest(f));
        System.out.println("Sum="+sum(f));
        System.out.println("Product="+product(f));
        System.out.println("CubeProduct="+cubeProduct(f));
    }
}
