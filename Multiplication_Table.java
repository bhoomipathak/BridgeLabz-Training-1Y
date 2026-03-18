package com.gla.array.Level1;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        int [] multiplication = new int[4];
        int index = 0;
        for (int i = 6 ; i <= 9 ; i++){
            multiplication[index] = n * i ;
            index++;
        }
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(n+ " * " + i + " = " + multiplication[index]);
            index++;
        }
    }
}

