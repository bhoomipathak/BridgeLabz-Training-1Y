
import java.util.*;
public class SquareSide
        {
            public static void main(String[] args) {
                double perimeter;
                Scanner input = new Scanner(System.in);

                // Taking user input for perimeter
                System.out.print("Enter the perimeter of the square: ");
                perimeter = input.nextDouble();

                // Calculate side (Perimeter = 4 * side)
                double side = perimeter / 4;

                System.out.println(
                        "The length of the side is " + side + " whose perimeter is " + perimeter
                );
            }
        }