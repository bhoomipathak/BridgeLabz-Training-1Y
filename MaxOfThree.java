package com.gla.problempractice1.level2;
import java.util.Scanner;

public class MaxOfThree {

    // Function to take input
    public static int[] takeInput(Scanner sc) {
        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        System.out.print("Enter third number: ");
        numbers[2] = sc.nextInt();

        return numbers;
    }

    // Function to find maximum
    public static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        int[] nums = takeInput(sc);

        // Find maximum
        int max = findMaximum(nums[0], nums[1], nums[2]);

        // Display result
        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}

