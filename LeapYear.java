import java.util.*;
public class LeapYear{
public static void main(String args[]){
Scanner ab = new Scanner(System.in);
int year = ab.nextInt();
if((year%4==0&&year%100!=0)||(year%400==0)){
System.out.println("Leap Year");
}
else {
System.out.println("Not Leap year");
}
}
}
