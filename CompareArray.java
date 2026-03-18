package com.gla.array.Level1;

import java.util.Scanner;

public class CompareArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < 0){
                System.out.println( arr[i] + " is Negative");
            } else if(arr[i] > 0){
                System.out.println ( arr[i] + " is Postive");
                if (arr[i] % 2 == 0){
                    System.out.println("Even");
                }else {
                    System.out.println("Odd");
                }
            }else {
                System.out.println(arr[i] + " is Zero");
            }
        }
        int first = arr[0];
        int last = arr[arr.length - 1];
        if (first == last){
            System.out.println("First and last element are equals");
        } else if (first < last) {
            System.out.println("First is smaller than the last");
        } else {
            System.out.println("First is greatest than the last");
        }
    }
}


