import java.util.*;
public class BonusofEmployee{
public static void main(String args[]){
Scanner sn = new Scanner(System.in);
 double salary = sn.nextDouble();
 int year=sn.nextInt();
 double bonus = 0;
 if(year>5){
 bonus = salary*0.05;
 System.out.println("bonus amount"+bonus);
 }
 else{
 System.out.println("no");
 }
 }
 }