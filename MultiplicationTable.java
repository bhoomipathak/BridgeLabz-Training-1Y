import java.util.*;
public class MultiplicationTable{
public static void main(String args[]){
Scanner sn = new Scanner(System.in);
int n = sn.nextInt();
for(int i =6;i<=9;i++){
System.out.println(n+"x"+i+"="+(n*i));
}
}
}