
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Integer obj = num; // autoboxing

        System.out.println("Primitive: " + num);
        System.out.println("Wrapper: " + obj);
    }
}