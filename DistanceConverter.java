import java.util.*;
public class DistanceConverter {
    public static void main(String[] args) {
        double distanceInFeet;
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();

        
        double distanceInYards = distanceInFeet / 3;          
        double distanceInMiles = distanceInYards / 1760;     

        System.out.println(
            "The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles"
        );
    }
}