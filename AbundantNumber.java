import java.util.*;
public class AbundantNumber{
public static void main(String args[]){
Scanner ar = new Scanner(System.in);
int num = ar.nextInt();
int sum = 0;
for(int i =1;i<num;i++){
if(num%i==0){
sum = sum + i;
}
}
if(sum>num){
System.out.println("AbundantNumber");
}
else{
System.out.println("Not");
}
}
}
