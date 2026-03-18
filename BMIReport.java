package com.gla.string.Level3;

import java.util.Scanner;

public class BMIReport {

    static double[][] takeInput() {

        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        return data;
    }

    static String[] findBMIStatus(double weight, double heightCm) {

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.valueOf(bmi), status};
    }

    static String[][] generateBMIReport(double[][] data) {

        String[][] report = new String[10][4];

        for (int i = 0; i < 10; i++) {

            String[] bmiData = findBMIStatus(data[i][0], data[i][1]);

            report[i][0] = String.valueOf(data[i][1]);
            report[i][1] = String.valueOf(data[i][0]);
            report[i][2] = bmiData[0];
            report[i][3] = bmiData[1];
        }
        return report;
    }

    static void display(String[][] report) {

        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < report.length; i++) {
            System.out.println(
                    report[i][0] + "\t\t" +
                            report[i][1] + "\t\t" +
                            report[i][2] + "\t" +
                            report[i][3]
            );
        }
    }

    public static void main(String[] args) {

        double[][] input = takeInput();
        String[][] report = generateBMIReport(input);
        display(report);
    }
}
