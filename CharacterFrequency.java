package com.gla.string.Level3;
import java.util.Scanner;

public class CharacterFrequency {

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

    static int[][] findCharacterFrequency(String text) {

        int[] freq = new int[256];
        int length = findLength(text);
        int i = 0;

        try {
            while (true) {
                char ch = text.charAt(i);
                freq[ch]++;
                i++;
            }
        } catch (Exception e) {
        }

        int uniqueCount = 0;
        for (i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                uniqueCount++;
                freq[ch] = -freq[ch];
            }
        }

        int[][] result = new int[uniqueCount][2];
        int index = 0;

        for (i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (freq[ch] < 0) {
                result[index][0] = ch;
                result[index][1] = -freq[ch];
                freq[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[][] result = findCharacterFrequency(input);

        for (int i = 0; i < result.length; i++) {
            System.out.println((char) result[i][0] + " : " + result[i][1]);
        }
    }
}

