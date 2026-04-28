import java.util.*;
public class CountDigit{
public static void main(String args[]){
Scanner ar = new Scanner(System.in);
int num = ar.nextInt();
int count = 0;
if(num==0){
count = 1;
}
else{
while(num!=0){
num /= 10;
count++;
}
}
System.out.println(count);
}
}
