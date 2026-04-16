import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20));

        Set<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println(uniqueList);
    }
}
    

