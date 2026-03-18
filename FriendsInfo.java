package com.gla.method.Level2;

import java.util.*;
public class FriendsInfo {
    public static int youngest(int[] age){
        int min=0;
        for(int i=1;i<age.length;i++)
            if(age[i]<age[min])
                min=i;
        return min;
    }
    public static int tallest(double[] height){
        int max=0;
        for(int i=1;i<height.length;i++)
            if(height[i]>height[max])
                max=i;
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] names={"Amar","Akbar","Anthony"};
        int[] age=new int[3];
        double[] height=new double[3];
        for(int i=0;i<3;i++)
            age[i]=sc.nextInt();
        for(int i=0;i<3;i++)
            height[i]=sc.nextDouble();
        System.out.println("Youngest: "+names[youngest(age)]);
        System.out.println("Tallest: "+names[tallest(height)]);
    }
}