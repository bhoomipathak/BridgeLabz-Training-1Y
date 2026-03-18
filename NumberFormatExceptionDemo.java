package com.gla.string.Level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    static void generateException(String text) {
        System.out.println("Generating Exception...");
        int num = Integer.parseInt(text); // Runtime Exception
        System.out.println("Number is: " + num); // yeh line execute nahi hogi
    }

    static void handleException(String text) {
        System.out.println("\nHandling Exception...");
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
            System.out.println("Error Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught Generic RuntimeException!");
        }
    }

    public static void main(String[] args) {

        // a. Take input as String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String input = sc.nextLine();

        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Program crashed due to exception!");
        }

        handleException(input);

        sc.close();
    }
}

