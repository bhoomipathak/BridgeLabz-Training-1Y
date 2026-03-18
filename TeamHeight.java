package com.gla.method.Level3;

import java.util.*;
public class TeamHeight {
    public static int[] generateHeights(){
        int[] h=new int[11];
        for(int i=0;i<h.length;i++)
            h[i]=(int)(Math.random()*101)+150;
        return h;
    }
    public static int sum(int[] h) {
        int s = 0;
        for (int i = 0; i < h.length; i++)
            s += h[i];
        return s;
    }
    public static double mean(int[] h){
        return (double)sum(h)/h.length;
    }
    public static int shortest(int[] h){
        int min=h[0];
        for(int i=1;i<h.length;i++)
            if(h[i]<min)
                min=h[i];
        return min;
    }
    public static int tallest(int[] h){
        int max=h[0];
        for(int i=1;i<h.length;i++)
            if(h[i]>max)
                max=h[i];
        return max;
    }
    public static void main(String args[]){
        int[] h=generateHeights();
        for(int i=0;i<h.length;i++)
            System.out.print(h[i]+" ");
        System.out.println("\nMean="+mean(h));
        System.out.println("Shortest="+shortest(h));
        System.out.println("Tallest="+tallest(h));
    }
}
