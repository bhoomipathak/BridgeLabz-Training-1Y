import java.util.*;
public class CheckNumber{
public static void main(String args[]){
Scanner ab = new Scanner(System.in);
int n = ab.nextInt();
if(n>0){
System.out.println("Positive");
}
else if(n<0){
System.out.println("Negative");
}
else{
System.out.println("Zero");
}
}
}

