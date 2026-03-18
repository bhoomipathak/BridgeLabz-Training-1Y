package com.gla.method.Level2;

import java.util.*;
public class BMIArray{
    public static void calculateBMI(double[][] data){
        for(int i=0;i<10;i++){
            double weight=data[i][0];
            double height=data[i][1]/100.0;
            double bmi=weight/(height*height);
            data[i][2]=bmi;
        }
    }
    public static String getStatus(double bmi){
        if(bmi<18.5)
            return "Underweight";
        else if(bmi<25)
            return "Normal";
        else if(bmi<40)
            return "Overweight";
        else
            return "Obese";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][3];
        for(int i=0;i<10;i++){
            data[i][0]=sc.nextDouble(); // weight
            data[i][1]=sc.nextDouble(); // height
        }
        calculateBMI(data);
        for(int i=0;i<10;i++){
            System.out.println(data[i][1]+" "+data[i][0]+" "+
                    data[i][2]+" "+getStatus(data[i][2]));
        }
    }
}