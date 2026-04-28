package com.gla.problempractice1.level2;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Function to generate a random guess within range
    public static int generateGuess(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    // Function to get user feedback
    public static String getFeedback(Scanner sc, int guess) {
        System.out.println("Computer guesses: " + guess);
        System.out.print("Is it High (H), Low (L), or Correct (C)?: ");
        return sc.nextLine().toUpperCase();
    }

    // Function to adjust range based on feedback
    public static int[] updateRange(String feedback, int guess, int min, int max) {
        if (feedback.equals("H")) {
            max = guess - 1;
        } else if (feedback.equals("L")) {
            min = guess + 1;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = 1, max = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100!");

        while (!found) {
            int guess = generateGuess(min, max);

            String feedback = getFeedback(sc, guess);

            if (feedback.equals("C")) {
                System.out.println("Yay! Computer guessed your number correctly 🎉");
                found = true;
            } else {
                int[] range = updateRange(feedback, guess, min, max);
                min = range[0];
                max = range[1];
            }
        }

        sc.close();
    }
}

