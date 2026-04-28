import java.util.*;
public class LargestOfthe3{
public static void main(String args[]){
Scanner a = new Scanner(System.in);
int num1 = a.nextInt();
int num2 = a.nextInt();
int num3 = a.nextInt();
 System.out.println("Is the first number the largest? " + (num1 > num2 && num1 > num3 ? "Yes" : "No"));

        System.out.println("Is the second number the largest? " + (num2 > num1 && num2 > num3 ? "Yes" : "No"));

        System.out.println("Is the third number the largest? " + (num3 > num1 && num3 > num2 ? "Yes" : "No"));
				}
				}
