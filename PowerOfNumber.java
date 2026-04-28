import java.util.*;
public class PowerOfNumber{
public static void main(String args[]){
Scanner a = new Scanner(System.in);
int n = a.nextInt();
int power = a.nextInt();
if(power<0){
System.out.println("positive integer of the power");
}
else{
int result = 1;
for(int i=1;i<=power;i++){
result *=n;
}
System.out.println(result);
}
}
}