import java.util.*;
public class BothComputation{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        int n=a.nextInt();
		int sumWhile =0;
		int i = 1;
		while(i<=n){
		sumWhile+=i;
		i++;
		}
		int sumFormula=n*(n+1)/2;
		if(sumWhile==sumFormula){
		System.out.println("both are equal");
		}
		else{
		System.out.println("the computation do not equal");
		}
		}
		}