
import java.util.*;
public class Kilom_to_Miles {
    public static void main(String[] args) {
        double km;
        double miles;

        Scanner input = new Scanner(System.in);

        // Taking user input
        km = input.nextInt();

        // Conversion
        miles = km / 1.6;

        System.out.println(
                "The total miles is " + miles + " mile for the given " + km + " km"
        );
    }
}