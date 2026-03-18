package com.gla.string.Level3;

import java.util.Scanner;

public class AnagramCheck {

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

    static boolean isAnagram(String text1, String text2) {

        int len1 = findLength(text1);
        int len2 = findLength(text2);

        if (len1 != len2) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        int i = 0;
        try {
            while (true) {
                freq1[text1.charAt(i)]++;
                freq2[text2.charAt(i)]++;
                i++;
            }
        } catch (Exception e) {
        }

        for (i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);
        System.out.println(result);
    }
}
