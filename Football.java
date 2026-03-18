package com.gla.array.Level1;

import java.util.Scanner;

public class Football {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double [] height = new double[11];
        System.out.println("Enter size :");
        for (int i = 0 ; i < height.length ; i++){
            height[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0 ; i < height.length; i++){
            sum = sum + height[i];
        }
        double mean = sum / height.length;
        System.out.println("The mean height of football team is :" + mean);
    }
}

