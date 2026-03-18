package com.gla.array.Level1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }
            if (index == 10) {
                break;
            }
            arr[index] = num;
            index++;
        }

        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total = total + arr[i];
        }
        System.out.println("\nSum of all numbers = " + total);

        sc.close();
    }
}

