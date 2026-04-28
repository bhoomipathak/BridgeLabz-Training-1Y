import java.util.*;
public class Calculator{
public static void main(String args[]){
Scanner ar = new Scanner(System.in);
double first,second;
String op;
first = ar.nextDouble();
second = ar.nextDouble();
op = ar.next();
switch(op){
case"-":
System.out.println(first-second);
break;
case"*":
System.out.println(first*second);
break;
case"/":
if(second!=0){
System.out.println(first/second);
}
else{
System.out.println("cannot divide");
}
break;
default:
System.out.println("invalid");
}
}
}