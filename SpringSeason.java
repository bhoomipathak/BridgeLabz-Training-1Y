import java.util.*;
public class SpringSeason{
public static void main(String args[]){
Scanner ab = new Scanner(System.in);
int month = ab.nextInt();
int day = ab.nextInt();
if((month==3&&day>=20)||(month==4)||(month==5)||(month==6&&day<=20)){
System.out.println("Its a String Season");
}
else{
System.out.println("Not a spring Season");
}
}
}