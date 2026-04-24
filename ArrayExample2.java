package com.gla.exceptionhandling;
import java.util.*;
public class ArrayExample2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter size: ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter elements:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("Enter index: ");
            int index=sc.nextInt();
            System.out.print("Enter divisor: ");
            int d=sc.nextInt();
            try{
                int value=arr[index];
                try{
                    int result=value/d;
                    System.out.println("Result: "+result);
                }
                catch(ArithmeticException e){
                    System.out.println("Cannot divide by zero!");
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid array index!");
            }
        }
    }
}
