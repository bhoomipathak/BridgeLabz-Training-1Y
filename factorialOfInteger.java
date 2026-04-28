import java.util.*;
public class factorialOfInteger{
public static void main(String args[]){
Scanner ab = new Scanner(System.in);
int n = ab.nextInt();
int fact = 1;
int i = 1;
while(i<=n){
fact *= i;
i++;
}
System.out.println(fact);
}
}
