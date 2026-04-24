
import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {

        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> marks = new ArrayList<>();

        for (Object obj : inputs) {
            try {
                if (obj instanceof Integer) {
                    marks.add((Integer) obj);
                } else if (obj instanceof String) {
                    if (!obj.equals("null")) {
                        marks.add(Integer.parseInt((String) obj));
                    }
                }
            } catch (Exception e) {
                // ignore invalid
            }
        }

        int sum = 0;
        for (int m : marks) sum += m;

        System.out.println("Average = " + (sum / (double) marks.size()));
    }
}