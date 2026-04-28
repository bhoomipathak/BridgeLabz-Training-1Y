import java.util.*;
public class FizzBuzz{
public static void main(String args[]){
Scanner sn = new Scanner(System.in);
int num = sn.nextInt();
if(num<0){
System.out.println("positive Integer");
}
else{
for(int i=1;i<=num;i++){
if(i%3==0&&i%5==0){
System.out.println("FizzBuzz");
}
else if(i%3==0){
System.out.println("Fizz");
}
else if(i%5==0){
System.out.println("Bizz");

}
else{
	System.out.println(i);
}
}
}
}
}
