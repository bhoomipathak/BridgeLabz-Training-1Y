package com.gla.method.Level3;

public class EmployeeBonus {
    public static double[][] generate(){
        double[][] data=new double[10][2];
        for(int i=0;i<10;i++){
            data[i][0]=(int)(Math.random()*90000)+10000; // salary
            data[i][1]=(int)(Math.random()*11); // years
        }
        return data;
    }
    public static double[][] calculate(double[][] d){
        double[][] res=new double[10][2];
        for(int i=0;i<10;i++){
            double salary=d[i][0];
            double years=d[i][1];
            double bonus=(years>5)?salary*0.05:salary*0.02;
            res[i][0]=salary+bonus;
            res[i][1]=bonus;
        }
        return res;
    }
    public static void summary(double[][] old,double[][] nw){
        double oldSum=0,newSum=0,bonusSum=0;
        for(int i=0;i<10;i++){
            oldSum+=old[i][0];
            newSum+=nw[i][0];
            bonusSum+=nw[i][1];
        }
        System.out.println("Old Total="+oldSum);
        System.out.println("New Total="+newSum);
        System.out.println("Total Bonus="+bonusSum);
    }
    public static void main(String args[]){
        double[][] data=generate();
        double[][] res=calculate(data);
        summary(data,res);
    }
}
