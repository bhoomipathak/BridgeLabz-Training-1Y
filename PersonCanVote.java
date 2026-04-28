import java.util.*;
public class PersonCanVote{
public static void main(String args[]){
Scanner ab = new Scanner(System.in);
int age = ab.nextInt();
if(age<=18){
System.out.println("vote");
}
else{
System.out.println("Not vote");
}
}
}