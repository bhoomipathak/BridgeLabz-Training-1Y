import java.util.*;
public class HarshadNumber{
public static void main(String args[]){
Scanner ar = new Scanner(System.in);
int num = ar.nextInt();
int originalNum = num;
int sum = 0;
while(num!=0){
sum = sum +(num%10);
num /= 10;
}
if(originalNum%sum==0){
System.out.println("HarshadNumber");
}
else{
System.out.println("Not");
}
}
}