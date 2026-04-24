
import java.util.*;

public class RatingsAnalyzer {
    public static void main(String[] args) {

        int[] primitiveRatings = {4, 5, 3};
        ArrayList<Integer> wrapperRatings = new ArrayList<>();
        wrapperRatings.add(5);
        wrapperRatings.add(null);
        wrapperRatings.add(4);

        ArrayList<Integer> allRatings = new ArrayList<>();

        // Add primitive ratings
        for (int r : primitiveRatings) {
            allRatings.add(r); // autoboxing
        }

        // Add wrapper ratings
        allRatings.addAll(wrapperRatings);

        int sum = 0, count = 0;

        for (Integer r : allRatings) {
            if (r != null) {
                sum += r;
                count++;
            }
        }

        System.out.println("Average Rating = " + (sum / (double) count));
    }
}