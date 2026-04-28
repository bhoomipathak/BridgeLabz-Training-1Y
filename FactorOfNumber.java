import java.util.*;
public class FactorOfNumber{
public static void main(String args[]){
Scanner ab = new Scanner(System.in);
int n = ab.nextInt();
if(n<=0){
System.out.println("Enter a valid numbaer:");
}
else{
System.out.println("Factor of"+n+"are:");
for(int i=1;i<=n;i++){
if(n%i==0){
System.out.println(i);
}
}
}
}
}