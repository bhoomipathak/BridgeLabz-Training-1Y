import java.util.*;
public class SmallestOfthe3{
public static void main(String args[]){
Scanner a = new Scanner(System.in);
int num1 = a.nextInt();
int num2 = a.nextInt();
int num3 = a.nextInt();
if(num1<num2&&num1<num3){
System.out.println("Is the First number the smallest?Yes");
}
else{
System.out.println("Is the first number the smallest? No");
}
}
}
