import java.util.*;
public class UserEnter0{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        int n;
        int sum =0;

        do {
            n = a.nextInt();
            sum += n;
        }
        while(n!=0);
        sum -= 0;
            System.out.println(sum);
        }
    }