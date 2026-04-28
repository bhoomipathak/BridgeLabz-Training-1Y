package com.gla.problempractice1.stringproblems;
import java.util.Scanner;

public class ToggleCase {

    // Function to toggle case
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch); // Non-alphabetic characters remain the same
            }
        }

        return toggled.toString();
    }

    // Function to take input
    public static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Function to display result
    public static void displayResult(String original, String toggled) {
        System.out.println("Original string: " + original);
        System.out.println("Toggled case string: " + toggled);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String input = takeInput(sc);

        // Toggle case
        String toggled = toggleCase(input);

        // Output
        displayResult(input, toggled);

        sc.close();
    }
}

