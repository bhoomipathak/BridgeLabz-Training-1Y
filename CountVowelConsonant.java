package com.gla.problempractice1.stringproblems;
import java.util.Scanner;
public class CountVowelConsonant {




        // Function to count vowels and consonants
        public static int[] countVowelsAndConsonants(String str) {
            int vowels = 0, consonants = 0;
            str = str.toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch >= 'a' && ch <= 'z') { // Only letters
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            return new int[]{vowels, consonants};
        }

        // Function to take input
        public static String takeInput(Scanner sc) {
            System.out.print("Enter a string: ");
            return sc.nextLine();
        }

        // Function to display result
        public static void displayResult(int vowels, int consonants) {
            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonants);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input
            String input = takeInput(sc);

            // Count vowels and consonants
            int[] counts = countVowelsAndConsonants(input);

            // Output
            displayResult(counts[0], counts[1]);

            sc.close();
        }
    }

