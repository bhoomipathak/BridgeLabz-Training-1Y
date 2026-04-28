import java.util.*;
public class TriangleArea {
    public static void main(String[] args) {
        double base, height;
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter base in inches: ");
        base = input.nextDouble();

        System.out.print("Enter height in inches: ");
        height = input.nextDouble();

       
        double areaInches = 0.5 * base * height;

              double areaCm = areaInches * 2.54 * 2.54;

        System.out.println(
                "The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters"
        );
    }
	}
	