package com.gla.exceptionhandling;
import java.util.*;
public class ArrayExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter size of array: ");
            int n=sc.nextInt();
            int arr[]=null;
            if (n>0) {
                arr = new int[n];
                System.out.println("Enter elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
            }
            System.out.print("Enter index: ");
            int index=sc.nextInt();
            int value=arr[index];
            System.out.println("Value at index " + index + ": " + value);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
        catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }
}