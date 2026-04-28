package com.gla.problempractice1.stringproblems;
import java.util.Scanner;

public class ReverseString {

    // Function to reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append characters in reverse order
        }
        return reversed;
    }

    // Function to take input
    public static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Function to display result
    public static void displayResult(String original, String reversed) {
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String input = takeInput(sc);

        // Reverse
        String reversed = reverseString(input);

        // Output
        displayResult(input, reversed);

        sc.close();
    }
}

