import java.util.*;
public class GreatestFactor{
public static void main(String args[]){
Scanner ab = new Scanner(System.in);
int n = ab.nextInt();
if(n<=0){
System.out.println("Enter a valid numbaer:");
}
else{
int greatestfact = 1;
for(int i=1;i<=n;i++){
if(n%1==0){
greatestfact=i;
}
}
System.out.println("Greatest factor of"+n+"is"+greatestfact);
}
}
}
