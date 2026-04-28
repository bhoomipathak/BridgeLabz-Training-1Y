package com.gla.problempractice1.level2;
import java.util.Scanner;

public class FibonacciGenerator {

    // Function to generate and print Fibonacci sequence
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci sequence up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    // Function to take input
    public static int takeInput(Scanner sc) {
        System.out.print("Enter number of terms: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int terms = takeInput(sc);

        // Validate input
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Generate Fibonacci
            generateFibonacci(terms);
        }

        sc.close();
    }
}

