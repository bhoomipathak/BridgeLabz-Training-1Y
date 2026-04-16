import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int k = 3;

        int n = arr.length;
        k = k % n; 

        int[] result = new int[n];

        
        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + k) % n];
        }

        System.out.println("Left Rotation: " + Arrays.toString(result));
    }
}