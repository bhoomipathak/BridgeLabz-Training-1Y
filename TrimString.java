package com.gla.string.Level2;

import java.util.Scanner;

public class TrimString {

    static int[] trimIndexes(String str) {

        int start = 0;
        int end = 0;

        while (true) {
            try {
                if (str.charAt(start) != ' ')
                    break;
                start++;
            } catch (Exception e) {
                break;
            }
        }

        int i = 0;
        while (true) {
            try {
                str.charAt(i);
                i++;
            } catch (Exception e) {
                break;
            }
        }

        end = i - 1;

        while (end >= start && str.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    static String createSubstring(String str, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {

        int i = 0;

        while (true) {
            try {
                if (s1.charAt(i) != s2.charAt(i))
                    return false;
                i++;
            } catch (Exception e) {
                break;
            }
        }

        try {
            s2.charAt(i);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] idx = trimIndexes(text);
        String customTrim = createSubstring(text, idx[0], idx[1]);
        String builtInTrim = text.trim();

        System.out.println(compareStrings(customTrim, builtInTrim));

        sc.close();
    }
}
