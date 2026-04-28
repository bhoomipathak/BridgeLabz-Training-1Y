import java.util.*;
public class CheckOddEven{
public static void main(String args[]){
Scanner a = new Scanner(System.in);
int num = a.nextInt();
for(int i=1 ;i<=num;i++){
if(num%2==0){
System.out.println(i+"Even");
}
else{
System.out.println(i+"Odd");
}
}
}
}
