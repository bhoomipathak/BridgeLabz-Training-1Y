package com.gla.problempractice1.stringproblems;
import java.util.Scanner;

public class SubstringOccurrences {

    // Function to take input
    public static String takeInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    // Function to count substring occurrences
    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move past this occurrence
        }

        return count;
    }

    // Function to display result
    public static void displayResult(String str, String sub, int count) {
        System.out.println("In the string: \"" + str + "\"");
        System.out.println("The substring \"" + sub + "\" occurs " + count + " time(s).");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String str = takeInput(sc, "Enter the main string: ");
        String sub = takeInput(sc, "Enter the substring to search: ");

        // Count occurrences
        int count = countOccurrences(str, sub);

        // Output
        displayResult(str, sub, count);

        sc.close();
    }
}

