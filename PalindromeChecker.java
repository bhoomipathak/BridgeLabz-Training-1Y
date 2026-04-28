package com.gla.problempractice1.stringproblems;
import java.util.Scanner;
public class PalindromeChecker {




        // Function to take input
        public static String takeInput(Scanner sc) {
            System.out.print("Enter a string: ");
            return sc.nextLine();
        }

        // Function to check if a string is a palindrome
        public static boolean isPalindrome(String str) {
            str = str.replaceAll("\\s+", "").toLowerCase(); // Remove spaces & lowercase
            int left = 0, right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        // Function to display result
        public static void displayResult(String str, boolean result) {
            if (result) {
                System.out.println("\"" + str + "\" is a Palindrome.");
            } else {
                System.out.println("\"" + str + "\" is NOT a Palindrome.");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input
            String input = takeInput(sc);

            // Check palindrome
            boolean result = isPalindrome(input);

            // Output
            displayResult(input, result);

            sc.close();
        }
    }

