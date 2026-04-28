package com.gla.problempractice1.level2;
import java.util.Scanner;

public class FactorialRecursion {

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Function to take input
    public static int takeInput(Scanner sc) {
        System.out.print("Enter a non-negative integer: ");
        return sc.nextInt();
    }

    // Function to display output
    public static void displayResult(int number, long fact) {
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int number = takeInput(sc);

        // Calculation
        long fact = factorial(number);

        // Output
        displayResult(number, fact);

        sc.close();
    }
}

