import java.util.*;
public class ArmstrongNumber{
public static void main(String args[]){
Scanner ab = new Scanner(System.in);
int n = ab.nextInt();
int originalnum=n;
int digits = 0;
int sum = 0;
int temp = n;
while(temp!=0){
digits++;
temp /= 10;
}
temp = n;
while(temp!=0){
int digit = temp%10;
sum += Math.pow(digit,digits);
temp /= 10;
}
if(sum == originalnum){
System.out.println(originalnum+"is an ArmstrongNumber");
}
else{
System.out.println(originalnum+"is not an ArmstrongNumber");
}
}
}