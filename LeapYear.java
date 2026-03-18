package com.gla.method.Level2;

import java.util.*;
public class LeapYear{
    public static boolean isLeap(int y){
        if(y<1582) return false;
        return (y%400==0)||(y%4==0 && y%100!=0);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(isLeap(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}