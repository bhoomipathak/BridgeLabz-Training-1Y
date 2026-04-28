import java.util.*;
public class factorialusingForLoop{
public static void main(String args[]){
Scanner ab = new Scanner(System.in);
int n = ab.nextInt();
int fact = 1;
for(int i=1;i<=n;i++){
fact *=i;
}
System.out.println(fact);
}
}