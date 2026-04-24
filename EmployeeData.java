
import java.util.*;

public class EmployeeData {
    public static void main(String[] args) {
        int[] ages = {22, 30, 18, 45, 27};

        ArrayList<Integer> ageList = new ArrayList<>();

        // Convert int[] → ArrayList<Integer>
        for (int age : ages) {
            ageList.add(age); // autoboxing
        }

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest Age = " + youngest);
        System.out.println("Oldest Age = " + oldest);
    }
}