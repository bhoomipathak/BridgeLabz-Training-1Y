package com.gla.problempractice1.stringproblems;
import java.util.Scanner;
public class RemoveString {




        // Function to remove duplicates
        public static String removeDuplicates(String str) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (result.indexOf(ch) == -1) { // if character not already in result
                    result += ch;
                }
            }
            return result;
        }

        // Function to take input
        public static String takeInput(Scanner sc) {
            System.out.print("Enter a string: ");
            return sc.nextLine();
        }

        // Function to display result
        public static void displayResult(String original, String modified) {
            System.out.println("Original string: " + original);
            System.out.println("String after removing duplicates: " + modified);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input
            String input = takeInput(sc);

            // Remove duplicates
            String modified = removeDuplicates(input);

            // Output
            displayResult(input, modified);

            sc.close();
        }
    }

