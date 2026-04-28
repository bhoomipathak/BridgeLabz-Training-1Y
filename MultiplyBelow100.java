import java.util.*;
public class MultiplyBelow100{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
if (n <= 0) {
System.out.println("Please enter a valid positive integer.");
} else {
System.out.println("Multiples of " + n + " below 100 are:");
int mul = n;
while(mul<100){
System.out.println(mul);
mul += n;
}
}
}
}

