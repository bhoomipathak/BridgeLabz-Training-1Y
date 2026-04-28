import java.util.*;
public class SumofNaturalnum{
public static void main(String args[]){
Scanner a = new Scanner(System.in);
int n = a.nextInt();
if(n>0){
System.out.println("Sum = "+(n*(n+1)/2));
}
else {
System.out.println("Not a natural number");
}
}
}