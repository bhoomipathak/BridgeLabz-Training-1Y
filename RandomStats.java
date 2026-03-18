package com.gla.method.Level2;

import java.util.*;
public class RandomStats{
    public static int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=(int)(Math.random()*9000)+1000;
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers){
        int min=numbers[0];
        int max=numbers[0];
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            if(numbers[i]<min) min=numbers[i];
            if(numbers[i]>max) max=numbers[i];
        }
        double avg=(double)sum/numbers.length;
        return new double[]{avg,min,max};
    }
    public static void main(String args[]){
        int[] arr=generate4DigitRandomArray(5);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        double[] res=findAverageMinMax(arr);
        System.out.println("\nAverage="+res[0]);
        System.out.println("Min="+(int)res[1]);
        System.out.println("Max="+(int)res[2]);
    }
}