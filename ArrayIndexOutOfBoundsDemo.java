package com.gla.string.Level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    static void generateException(String[] names) {
        System.out.println("Generating Exception...");

        System.out.println("Name at index 10: " + names[10]);
    }

    static void handleException(String[] names) {
        System.out.println("\nHandling Exception...");

        try {
            System.out.println("Name at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
            System.out.println("Error Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught Generic RuntimeException!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Program crashed due to exception!");
        }

        handleException(names);

        sc.close();
    }
}
