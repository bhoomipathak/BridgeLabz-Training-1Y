package com.gla.method.Level1;

import java.util.*;
public class Trignometry {
    public static double[] calculateTrigonometricFunctions(double angle){
        double rad=Math.toRadians(angle);
        double sin=Math.sin(rad);
        double cos=Math.cos(rad);
        double tan=Math.tan(rad);
        return new double[]{sin,cos,tan};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double angle=sc.nextDouble();
        double[] res=calculateTrigonometricFunctions(angle);
        System.out.println("Sin: "+res[0]);
        System.out.println("Cos: "+res[1]);
        System.out.println("Tan: "+res[2]);
    }
}