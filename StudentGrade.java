package com.gla.string.Level2;

import java.util.Scanner;

public class StudentGrade {

    static int[][] generateScores(int n) {

        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    static double[][] calculateResult(int[][] scores) {

        int n = scores.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3;
            double per = (total / 300) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(per * 100.0) / 100.0;
        }
        return result;
    }

    static String[] calculateGrade(double[][] result) {

        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double p = result[i][2];

            if (p >= 80) grade[i] = "A";
            else if (p >= 70) grade[i] = "B";
            else if (p >= 60) grade[i] = "C";
            else if (p >= 50) grade[i] = "D";
            else if (p >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        return grade;
    }

    static void display(int[][] scores, double[][] result, String[] grade) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            grade[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] result = calculateResult(scores);
        String[] grade = calculateGrade(result);

        display(scores, result, grade);

        sc.close();
    }
}
