package com.gla.problempractice1.level2;
import java.util.Scanner;

public class TemperatureConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Menu
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        double inputTemp, result;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = sc.nextDouble();
                result = celsiusToFahrenheit(inputTemp);
                System.out.println("Temperature in Fahrenheit: " + result);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemp = sc.nextDouble();
                result = fahrenheitToCelsius(inputTemp);
                System.out.println("Temperature in Celsius: " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

