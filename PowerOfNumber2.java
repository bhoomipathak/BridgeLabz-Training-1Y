import java.util.*;
public class PowerOfNumber2{
public static void main(String args[]){
Scanner a = new Scanner(System.in);
int n = a.nextInt();
int power = a.nextInt();
if(power<0){
System.out.println("positive integer of the power");
}
else{
int result = 1;
int i=1;
while(i<=power){
result *=n;
i++;
}
System.out.println(result);
}
}
}