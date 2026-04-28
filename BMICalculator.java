import java.util.*;
public class BMICalculator{
public static void main(String args[]){
Scanner ar = new Scanner(System.in);
double weight = ar.nextDouble();
double height = ar.nextDouble();
double BMIformula = weight/(height*height);
if(BMIformula<=18.4){
System.out.println("Underweight");
}
else if(BMIformula <= 24.9 && BMIformula >= 18.5){
System.out.println("Normal");
}
else if(BMIformula <= 39.9 && BMIformula >= 25.0){
System.out.println("OverWeight");
}
else{
System.out.println("Obese");
}
}
}