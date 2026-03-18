package com.gla.method.Level2;

public class UnitConvertor3 {
    public static double convertFahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }
    public static double convertCelsiusToFahrenheit(double c){
        return (c*9/5)+32;
    }
    public static double convertPoundsToKg(double pounds){
        double pounds2kg=0.453592;
        return pounds*pounds2kg;
    }
    public static double convertKgToPounds(double kg){
        double kg2pounds=2.20462;
        return kg*kg2pounds;
    }
    public static double convertGallonsToLiters(double gallons){
        double gallons2liters=3.78541;
        return gallons*gallons2liters;
    }
    public static double convertLitersToGallons(double liters){
        double liters2gallons=0.264172;
        return liters*liters2gallons;
    }
    public static void main(String args[]){
        System.out.println(convertFahrenheitToCelsius(100));
        System.out.println(convertCelsiusToFahrenheit(37));
        System.out.println(convertPoundsToKg(10));
        System.out.println(convertKgToPounds(5));
        System.out.println(convertGallonsToLiters(2));
        System.out.println(convertLitersToGallons(5));
    }
}