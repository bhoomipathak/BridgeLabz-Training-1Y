import java.util.*;
public class GreatestFactor2{
public static void main(String args[]){
Scanner ab = new Scanner(System.in);
int n = ab.nextInt();
if(n<=0){
System.out.println("Enter a valid numbaer:");
}
else{
int greatestfact = 1;
int i=1;
while(i<=n){
if(n%1==0){
greatestfact=i;
}
i++;
}
System.out.println("Greatest factor of"+n+"is"+greatestfact);
}
}
}