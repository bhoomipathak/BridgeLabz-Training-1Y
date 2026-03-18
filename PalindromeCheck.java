package com.gla.string.Level3;

import java.util.Scanner;

public class PalindromeCheck {

    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    static boolean isPalindromeLogic1(String text) {

        int start = 0;
        int end = findLength(text) - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeLogic2(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    static char[] reverseString(String text) {

        int length = findLength(text);
        char[] reverse = new char[length];
        int index = 0;

        for (int i = length - 1; i >= 0; i--) {
            reverse[index] = text.charAt(i);
            index++;
        }

        return reverse;
    }

    static boolean isPalindromeLogic3(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean result1 = isPalindromeLogic1(input);
        boolean result2 = isPalindromeLogic2(input, 0, findLength(input) - 1);
        boolean result3 = isPalindromeLogic3(input);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
