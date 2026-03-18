package com.gla.method.Level3;

import java.util.*;
public class MatrixAdavanced{
    public static int[][] randomMatrix(int r,int c){
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                m[i][j]=(int)(Math.random()*5)+1;
        return m;
    }
    public static int[][] transpose(int[][] m){
        int[][] t=new int[m[0].length][m.length];
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m[0].length;j++)
                t[j][i]=m[i][j];
        return t;
    }
    public static int det2(int[][] m){
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }
    public static int det3(int[][] m){
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    public static double[][] inverse2(int[][] m){
        int det=det2(m);
        double[][] inv=new double[2][2];
        inv[0][0]=m[1][1]/(double)det;
        inv[1][1]=m[0][0]/(double)det;
        inv[0][1]=-m[0][1]/(double)det;
        inv[1][0]=-m[1][0]/(double)det;
        return inv;
    }
    public static void display(double[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++)
                System.out.print(m[i][j]+" ");
            System.out.println();
        }
    }
    public static void displayInt(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++)
                System.out.print(m[i][j]+" ");
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[][] m2=randomMatrix(2,2);
        displayInt(m2);
        System.out.println("Det2="+det2(m2));
        display(inverse2(m2));
        int[][] m3=randomMatrix(3,3);
        displayInt(m3);
        System.out.println("Det3="+det3(m3));
    }
}
