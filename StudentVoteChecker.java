package com.gla.method.Level2;

import java.util.*;
public class StudentVoteChecker{
    public static boolean canStudentVote(int age){
        if(age<0) return false;
        if(age>=18) return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<10;i++){
            age[i]=sc.nextInt();
            System.out.println(canStudentVote(age[i]));
        }
    }
}
