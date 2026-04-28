package com.gla.problempractice1.stringproblems;
import java.util.Scanner;

public class LongestWordFinder {

    // Function to take input
    public static String takeInput(Scanner sc) {
        System.out.print("Enter a sentence: ");
        return sc.nextLine();
    }

    // Function to find the longest word
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split by spaces
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    // Function to display result
    public static void displayResult(String sentence, String longestWord) {
        System.out.println("Original sentence: " + sentence);
        System.out.println("Longest word: " + longestWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String sentence = takeInput(sc);

        // Find longest word
        String longestWord = findLongestWord(sentence);

        // Output
        displayResult(sentence, longestWord);

        sc.close();
    }
}

