import java.util.Scanner;

public class Arof_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = scanner.nextDouble();

   
        double areaCm2 = 0.5 * baseCm * heightCm;

      
        // 1 inch = 2.54 cm => 1 sq in = 2.54 * 2.54 sq cm = 6.4516 sq cm
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        
        System.out.println("The area of the triangle in square inches is " + areaIn2 
                + " and in square centimeters is " + areaCm2);

       
    }
}
