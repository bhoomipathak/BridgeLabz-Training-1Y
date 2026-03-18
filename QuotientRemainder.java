package com.gla.method.Level1;

import java.util.*;
public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number,int divisor){
        int quotient=number/divisor;
        int remainder=number%divisor;
        return new int[]{quotient,remainder};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int divisor=sc.nextInt();
        int[] res=findRemainderAndQuotient(number,divisor);
        System.out.println("Quotient: "+res[0]);
        System.out.println("Remainder: "+res[1]);
    }
}